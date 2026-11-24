package coreforge.commands.RV32I;

import coreforge.KernelCommand;
import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.commands.ThreeArgumentCommand;
import coreforge.typesFormat.BranchTypeFormat;

/**
 * Represents the RV32I {@code BNE} instruction.
 *
 * <p>In RISC-V, this instruction branches if the register values differ.
 * The execution method is currently a stub.
 *
 * @param <T> register implementation used by the kernel
 */
@RiscVCommand(opcode = 0b0011100011, type = BranchTypeFormat.class)
public class BneCommand<T extends Register<T>> extends ThreeArgumentCommand<T> {
    /**
     * Creates the {@code BNE} command for a kernel.
     *
     * @param cpu kernel that provides access to registers and memory
     */
    public BneCommand(KernelCommand<T> cpu) {
        super(cpu);
    }

    @Override
    public void startPrecondition() {

    }

    @Override
    public void startAction() {

    }
}
