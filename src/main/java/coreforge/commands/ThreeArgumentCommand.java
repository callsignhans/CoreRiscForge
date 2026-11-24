package coreforge.commands;

import coreforge.KernelCommand;
import coreforge.Register;

/**
 * Stores the three decoded operands shared by commands of this shape.
 *
 * @param <T> register implementation used by the kernel
 */
public abstract class ThreeArgumentCommand<T extends Register<T>> extends Command<T> {
    /**
     * First decoded operand, typically the destination register index.
     */
    protected int result;
    /**
     * Second decoded operand.
     */
    protected int argumentOne;
    /**
     * Third decoded operand.
     */
    protected int argumentTwo;

    /**
     * Creates a command with three operand slots.
     *
     * @param cpu kernel that provides access to registers and memory
     */
    public ThreeArgumentCommand(KernelCommand<T> cpu) {
        super(cpu);
    }

    /**
     * Stores the first three entries of the decoded operand array in order.
     *
     * @param data decoded operands with at least three entries
     * @throws ArrayIndexOutOfBoundsException if the array has fewer than three entries
     */
    @Override
    public final void setValue(int[] data) {
        result = data[0];
        argumentOne = data[1];
        argumentTwo = data[2];
    }
}
