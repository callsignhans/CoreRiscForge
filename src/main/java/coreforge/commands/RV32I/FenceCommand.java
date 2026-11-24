package coreforge.commands.RV32I;

import coreforge.KernelCommand;
import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.commands.ThreeArgumentCommand;
import coreforge.typesFormat.ImmediateTypeFormat;

/**
 * Represents the RV32I {@code FENCE} instruction.
 *
 * <p>In RISC-V, this instruction orders memory and device I/O operations.
 * The execution method is currently a stub.
 *
 * @param <T> register implementation used by the kernel
 */
@RiscVCommand(opcode = 0b0000001111, type = ImmediateTypeFormat.class)
public class FenceCommand<T extends Register<T>> extends ThreeArgumentCommand<T> {
    /**
     * Creates the {@code FENCE} command for a kernel.
     *
     * @param cpu kernel that provides access to registers and memory
     */
    public FenceCommand(KernelCommand<T> cpu) {
        super(cpu);
    }

    @Override
    public void startPrecondition() {

    }

    @Override
    public void startAction() {

    }
}
