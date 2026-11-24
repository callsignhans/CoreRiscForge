package coreforge.typesFormat;

import coreforge.KernelCommand;
import coreforge.Register;
import coreforge.commands.*;
import org.reflections.Reflections;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Maps decoded opcode keys to reusable commands for an instruction format.
 *
 * @param <T> register implementation used by the kernel
 */
public abstract class TypeCommandFormat<T extends Register<T>> {
    int[] args;
    HashMap<Integer, Command<?>> commands = new HashMap<>();

    /**
     * Discovers and instantiates commands for the given base opcode.
     *
     * @param opcode      seven-bit base opcode to register
     * @param cpu         kernel that provides access to registers and memory
     * @param subPackages instruction package names relative to
     *                    {@code coreforge.commands}
     * @throws IllegalArgumentException if instruction registration finds a conflict
     *                                  or an
     *                                  incompatible constructor
     */
    public TypeCommandFormat(int opcode, KernelCommand<T> cpu, List<String> subPackages) {
        Integer maxOpcode = -1 >>> (32 - getCountBitInOpcode());
        for (var pack : subPackages) {
            Reflections reflections = new Reflections("coreforge.commands." + pack);
            var riscVCommands = reflections.getSubTypesOf(Command.class).stream()
                    .filter(command -> command.isAnnotationPresent(RiscVCommand.class))
                    .filter(command -> (command.getAnnotation(RiscVCommand.class).opcode() & 0b1111111) == opcode)
                    .collect(Collectors.toSet());
            for (var command : riscVCommands) {
                Integer nowOpcode = command.getAnnotation(RiscVCommand.class).opcode();
                if (nowOpcode > maxOpcode) {
                    throw new IllegalArgumentException("Opcode in class " + command.getName() +
                            " more max size (" + getCountBitInOpcode() + ")" +
                            " opcode for this type command, this type command: " +
                            this.getClass().getName() + " in package " + pack);
                }
                if (!commands.containsKey(nowOpcode) ||
                        commands.get(nowOpcode).getClass().getPackage() != command.getPackage()) {
                    try {
                        commands.put(nowOpcode, command.getConstructor(KernelCommand.class)
                                .newInstance(cpu));
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
                            throw new IllegalArgumentException("Class " + command.getName() +
                                    " haven't correct constructor, package " + pack);
                        }
                    }
                } else {
                    throw new IllegalArgumentException("Classes " + command.getName() +
                            " and " + commands.get(nowOpcode) + " have same opcode. Opcode is " +
                            nowOpcode + ", package " + pack);
                }
            }
        }
    }

    /**
     * Extracts the command lookup key from the instruction bytes.
     *
     * @param command four instruction bytes in most-significant-byte-first order
     * @return opcode key used to find the command
     */
    protected abstract int getOpcodeFromCommand(byte[] command);

    /**
     * Returns the number of operands extracted by this format.
     *
     * @return operand count
     */
    protected abstract int getCountArg();

    /**
     * Extracts the operands from the encoded instruction.
     *
     * @param outputArray array that receives the decoded operands
     * @param command     four instruction bytes in most-significant-byte-first
     *                    order
     */
    protected abstract void getArgs(int[] outputArray, byte[] command);

    protected abstract int getCountBitInOpcode();

    /**
     * Finds the matching command and replaces its operands with the decoded values.
     *
     * @param command four instruction bytes in most-significant-byte-first order
     * @return cached command with the new operands
     * @throws NullPointerException if no command is registered for the extracted
     *                              opcode
     */
    public final Command decode(byte[] command) {
        if (args == null) {
            args = new int[getCountArg()];
        }
        var opcode = getOpcodeFromCommand(command);
        getArgs(args, command);
        commands.get(opcode).setValue(args);
        return commands.get(opcode);
    }

}
