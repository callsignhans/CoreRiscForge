package coreforge.commands;

import coreforge.KernelCommand;
import coreforge.Register;

/**
 * Defines the lifecycle of a decoded RISC-V instruction.
 *
 * @param <T> register implementation used by the kernel
 */
public abstract class Command<T extends Register<T>> {
    /**
     * Kernel used to access registers and memory.
     */
    protected KernelCommand<T> cpu;
    /**
     * Storage for the instruction privilege level.
     */
    protected int levelPrivilege;

/**
 * Binds the instruction to a kernel.
 *
 * @param cpu kernel that provides access to registers and memory
 */
public Command (KernelCommand<T> cpu){
        this.cpu = cpu;
    }

    /**
     * Stores the decoded operands for the next execution.
     *
     * @param data operands in the order supplied by the instruction format
     */
    public abstract void setValue(int[] data);
    /**
     * Runs the instruction-specific checks before execution.
     */
    public abstract void startPrecondition();
    /**
     * Executes the instruction using the operands supplied by {@link #setValue(int[])}.
     */
    public abstract void startAction();

}
