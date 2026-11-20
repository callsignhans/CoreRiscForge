package coreforge;

import coreforge.commands.*;
import coreforge.typesFormat.*;
import org.reflections.Reflections;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.stream.Collectors;

public class Decoder<T extends Register<T>> {
    TypeCommandFormat<T>[] parsers = new TypeCommandFormat[128];

    public Decoder(KernelCommand<T> cpu, List<String> subPackages) {
        for (var pack : subPackages) {
            var localParsers = new TypeCommandFormat[128];
            pack = "coreforge.commands." + pack;
            Reflections reflections = new Reflections(pack);
            var riscVCommands = reflections.getSubTypesOf(Command.class).stream()
                    .filter(command -> command.isAnnotationPresent(RiscVCommand.class))
                    .map(command -> command.getAnnotation(RiscVCommand.class))
                    .collect(Collectors.toSet());
            for (var command : riscVCommands) {
                int commandOpcode = command.opcode() & 0b1111111;
                if (parsers[commandOpcode] == null || parsers[commandOpcode].getClass() == command.type()) {
                    try {
                        parsers[commandOpcode] = command.type()
                                .getConstructor(int.class, KernelCommand.class, List.class)
                                .newInstance(commandOpcode, cpu, subPackages);
                    } catch (InstantiationException | IllegalAccessException | InvocationTargetException
                            | NoSuchMethodException e) {
                        if (e.getClass() == InvocationTargetException.class) {
                            Throwable originalException = e.getCause();
                            if (originalException instanceof RuntimeException) {
                                throw (RuntimeException) originalException;
                            }
                            if (originalException instanceof Error) {
                                throw (Error) originalException;
                            }
                            throw new RuntimeException(originalException);
                        } else {
                            throw new IllegalArgumentException("Class " + command.type().getName() +
                                    " haven't correct constructor");
                        }
                    }
                } else {
                    throw new IllegalArgumentException("Classes " + command.type().getName() +
                            " and " + parsers[commandOpcode] + " have same opcode. Opcode is " +
                            commandOpcode + ", package " + pack);
                }
            }
        }
    }

    public Command parse(byte[] command) {
        if (command.length != 4) {
            throw new IllegalArgumentException("Size command in Risc-V architecture equal 4 bytes");
        }
        return parsers[command[3] & 0b1111111].decode(command);
    }
}
