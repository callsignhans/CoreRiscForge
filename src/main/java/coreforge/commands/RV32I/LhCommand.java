package coreforge.commands.RV32I;

import coreforge.KernelCommand;
import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.commands.ThreeArgumentCommand;
import coreforge.typesFormat.ImmediateTypeFormat;

/**
 * Represents the RV32I {@code LH} instruction.
 *
 * <p>In RISC-V, this instruction loads a 16-bit halfword from memory and sign-extends it.
 * The execution method is currently a stub.
 *
 * @param <T> register implementation used by the kernel
 */
@RiscVCommand(opcode = 0b0010000011, type = ImmediateTypeFormat.class)
public class LhCommand<T extends Register<T>> extends ThreeArgumentCommand<T> {

    /**
     * Creates the {@code LH} command for a kernel.
     *
     * @param cpu kernel that provides access to registers and memory
     */
    public LhCommand(KernelCommand<T> cpu) {
        super(cpu);
    }

    @Override
    public void startPrecondition() {

    }

    @Override
    public void startAction() {

    }
}
