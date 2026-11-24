package coreforge.commands.RV32I;

import coreforge.KernelCommand;
import coreforge.Register;
import coreforge.commands.RiscVCommand;
import coreforge.commands.ThreeArgumentCommand;
import coreforge.typesFormat.RegisterTypeFormat;

/**
 * Represents the RV32I {@code SLT} instruction.
 *
 * <p>In RISC-V, this instruction tests whether the first signed register value is less than the second and writes 1 or 0.
 * The execution method is currently a stub.
 *
 * @param <T> register implementation used by the kernel
 */
@RiscVCommand(opcode = 0b00000000100110011, type = RegisterTypeFormat.class)
public class SltCommand<T extends Register<T>> extends ThreeArgumentCommand<T> {
    /**
     * Creates the {@code SLT} command for a kernel.
     *
     * @param cpu kernel that provides access to registers and memory
     */
    public SltCommand(KernelCommand<T> cpu) {
        super(cpu);
    }

    @Override
    public void startPrecondition() {

    }

    @Override
    public void startAction() {

    }
}
