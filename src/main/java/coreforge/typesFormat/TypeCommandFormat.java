package coreforge.typesFormat;

import coreforge.KernelCommand;
import coreforge.commands.*;
import org.reflections.Reflections;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.stream.Collectors;

public abstract class TypeCommandFormat {
    int[] args;
    HashMap<Integer, Command>commands = new HashMap<>();

    public TypeCommandFormat(int opcode, KernelCommand cpu) {
        Reflections reflections = new Reflections("coreforge.commands");
        var riscVCommands = reflections.getSubTypesOf(Command.class).stream().
            filter(command -> command.isAnnotationPresent(RiscVCommand.class)).
            filter(command ->
                (command.getAnnotation(RiscVCommand.class).opcode() & 0b1111111) == opcode).
            collect(Collectors.toSet());
        for (var command : riscVCommands) {
            Integer nowOpcode = command.getAnnotation(RiscVCommand.class).opcode();
            if (!commands.containsKey(nowOpcode)) {
                try {
                    commands.put(nowOpcode, command.getConstructor(KernelCommand.class)
                        .newInstance(cpu));
                } catch (InstantiationException | IllegalAccessException |
                         InvocationTargetException | NoSuchMethodException e) {
                    if (e.getClass() == InvocationTargetException.class) {
                        Throwable originalException = e.getCause();
                        if (originalException instanceof RuntimeException) {
                            throw (RuntimeException) originalException;
                        }
                        if (originalException instanceof Error) {
                            throw (Error) originalException;
                        }
                        throw new RuntimeException(originalException);
                    }
                    else {
                        throw new IllegalArgumentException("Class " + command.getName() +
                            " haven't correct constructor");
                    }
                }
            } else {
                throw new IllegalArgumentException("Classes " + command.getName() +
                    " and " + commands.get(nowOpcode) + " have same opcode. Opcode is " +
                    nowOpcode);
            }
        }
    }
    protected abstract int getOpcodeFromCommand(byte[] command);
    protected abstract int getCountArg();
    protected abstract void getArgs(int[] outputArray, byte[] command);
    public final Command decode(byte[] command){
        if (args == null) {
            args = new int[getCountArg()];
        }
        var opcode = getOpcodeFromCommand(command);
        getArgs(args, command);
        commands.get(opcode).setValue(args);
        return  commands.get(opcode);
    }

}
