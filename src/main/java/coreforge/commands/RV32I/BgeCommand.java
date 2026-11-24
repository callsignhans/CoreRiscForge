package coreforge.commands.RV32I;

import coreforge.KernelCommand;
import coreforge.Register;
import coreforge.commands.RiscVCommand;
import coreforge.commands.ThreeArgumentCommand;
import coreforge.typesFormat.BranchTypeFormat;

/**
 * Represents the RV32I {@code BGE} instruction.
 *
 * <p>In RISC-V, this instruction branches if the first signed register value is greater than or
 * equal to the second.
 * The execution method is currently a stub.
 *
 * @param <T> register implementation used by the kernel
 */
@RiscVCommand(opcode = 0b1011100011, type = BranchTypeFormat.class)
public class BgeCommand<T extends Register<T>> extends ThreeArgumentCommand<T> {
    /**
     * Creates the {@code BGE} command for a kernel.
     *
     * @param cpu kernel that provides access to registers and memory
     */
    public BgeCommand(KernelCommand<T> cpu) {
        super(cpu);
    }

    @Override
    public void startPrecondition() {

    }

    @Override
    public void startAction() {

    }
}
