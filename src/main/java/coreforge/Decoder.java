package coreforge;

import coreforge.commands.*;
import coreforge.typesFormat.*;
import org.reflections.Reflections;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Selects an instruction format from the base opcode of a RISC-V instruction.
 *
 * @param <T> register implementation used by the kernel
 */
public class Decoder<T extends Register<T>> {
    TypeCommandFormat<T>[] parsers = new TypeCommandFormat[128];

    /**
     * Discovers instruction formats in the requested packages.
     *
     * @param cpu         kernel that provides access to registers and memory
     * @param subPackages instruction package names relative to
     *                    {@code coreforge.commands}
     * @throws IllegalArgumentException if instruction registration finds a conflict
     *                                  or an
     *                                  incompatible constructor
     */
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
                            commandOpcode + " in package " + pack);
                }
            }
        }
    }

    /**
     * Decodes an instruction and loads its operands into a cached command.
     *
     * @param command four instruction bytes in most-significant-byte-first order
     * @return command with the decoded operands
     * @throws IllegalArgumentException if the instruction does not contain four
     *                                  bytes
     * @throws NullPointerException     if no decoder or command is registered for
     *                                  the opcode
     */
    public Command parse(byte[] command) {
        if (command.length != 4) {
            throw new IllegalArgumentException("Size command in Risc-V architecture equal 4 bytes");
        }
        return parsers[command[3] & 0b1111111].decode(command);
    }
}
