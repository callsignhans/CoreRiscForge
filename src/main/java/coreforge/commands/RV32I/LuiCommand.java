package coreforge.commands.RV32I;

import coreforge.KernelCommand;
import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.commands.TwoArgumentCommand;
import coreforge.typesFormat.UpperImmediateTypeFormat;

/**
 * Represents the RV32I {@code LUI} instruction.
 *
 * <p>In RISC-V, this instruction loads an immediate into the upper 20 bits of a word and clears the
 * low 12 bits.
 * The execution method is currently a stub.
 *
 * @param <T> register implementation used by the kernel
 */
@RiscVCommand(opcode = 0b0110111, type = UpperImmediateTypeFormat.class)
public class LuiCommand<T extends Register<T>> extends TwoArgumentCommand<T> {

    /**
     * Creates the {@code LUI} command for a kernel.
     *
     * @param cpu kernel that provides access to registers and memory
     */
    public LuiCommand(KernelCommand<T> cpu) {
        super(cpu);
    }

    @Override
    public void startPrecondition() {

    }

    @Override
    public void startAction() {

    }
}
