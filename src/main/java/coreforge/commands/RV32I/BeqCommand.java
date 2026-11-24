package coreforge.commands.RV32I;

import coreforge.KernelCommand;
import coreforge.Register;
import coreforge.commands.RiscVCommand;
import coreforge.commands.ThreeArgumentCommand;
import coreforge.typesFormat.BranchTypeFormat;

/**
 * Represents the RV32I {@code BEQ} instruction.
 *
 * <p>In RISC-V, this instruction branches if the register values are equal.
 * The execution method is currently a stub.
 *
 * @param <T> register implementation used by the kernel
 */
@RiscVCommand(opcode = 0b0001100011, type = BranchTypeFormat.class)
public class BeqCommand<T extends Register<T>> extends ThreeArgumentCommand<T> {
    /**
     * Creates the {@code BEQ} command for a kernel.
     *
     * @param cpu kernel that provides access to registers and memory
     */
    public BeqCommand(KernelCommand<T> cpu) {
        super(cpu);
    }

    @Override
    public void startPrecondition() {

    }

    @Override
    public void startAction() {

    }
}
