package coreforge.commands.RV32I;

import coreforge.KernelCommand;
import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.commands.ThreeArgumentCommand;
import coreforge.typesFormat.ImmediateTypeFormat;

/**
 * Represents the RV32I {@code LHU} instruction.
 *
 * <p>In RISC-V, this instruction loads a 16-bit halfword from memory and zero-extends it.
 * The execution method is currently a stub.
 *
 * @param <T> register implementation used by the kernel
 */
@RiscVCommand(opcode = 0b1010000011, type = ImmediateTypeFormat.class)
public class LhuCommand<T extends Register<T>> extends ThreeArgumentCommand<T> {

    /**
     * Creates the {@code LHU} command for a kernel.
     *
     * @param cpu kernel that provides access to registers and memory
     */
    public LhuCommand(KernelCommand<T> cpu) {
        super(cpu);
    }

    @Override
    public void startPrecondition() {

    }

    @Override
    public void startAction() {

    }
}
