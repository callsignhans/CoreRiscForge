package coreforge.commands;

import coreforge.KernelCommand;
import coreforge.Register;

/**
 * Stores the two decoded operands shared by commands of this shape.
 *
 * @param <T> register implementation used by the kernel
 */
public abstract class TwoArgumentCommand<T extends Register<T>> extends Command<T> {
    /**
     * First decoded operand, typically the destination register index.
     */
    protected int result;
    /**
     * Second decoded operand.
     */
    protected int argument;

    /**
     * Creates a command with two operand slots.
     *
     * @param cpu kernel that provides access to registers and memory
     */
    public TwoArgumentCommand(KernelCommand<T> cpu) {
        super(cpu);
    }

    /**
     * Stores the first two entries of the decoded operand array in order.
     *
     * @param data decoded operands with at least two entries
     * @throws ArrayIndexOutOfBoundsException if the array has fewer than two entries
     */
    @Override
    public final void setValue(int[] data) {
        result = data[0];
        argument = data[1];
    }
}
