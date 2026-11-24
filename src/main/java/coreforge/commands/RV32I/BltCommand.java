package coreforge.commands.RV32I;

import coreforge.KernelCommand;
import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.commands.ThreeArgumentCommand;
import coreforge.typesFormat.BranchTypeFormat;

/**
 * Represents the RV32I {@code BLT} instruction.
 *
 * <p>In RISC-V, this instruction branches if the first signed register value is less than the second.
 * The execution method is currently a stub.
 *
 * @param <T> register implementation used by the kernel
 */
@RiscVCommand(opcode = 0b1001100011, type = BranchTypeFormat.class)
public class BltCommand<T extends Register<T>> extends ThreeArgumentCommand<T> {
    /**
     * Creates the {@code BLT} command for a kernel.
     *
     * @param cpu kernel that provides access to registers and memory
     */
    public BltCommand(KernelCommand<T> cpu) {
        super(cpu);
    }

    @Override
    public void startPrecondition() {

    }

    @Override
    public void startAction() {

    }
}
