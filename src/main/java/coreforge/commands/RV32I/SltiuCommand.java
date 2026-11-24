package coreforge.commands.RV32I;

import coreforge.KernelCommand;
import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.commands.ThreeArgumentCommand;
import coreforge.typesFormat.ImmediateTypeFormat;

/**
 * Represents the RV32I {@code SLTIU} instruction.
 *
 * <p>In RISC-V, this instruction tests whether a register is less than a sign-extended immediate
 * using an unsigned comparison.
 * The execution method is currently a stub.
 *
 * @param <T> register implementation used by the kernel
 */
@RiscVCommand(opcode = 0b0110010011, type = ImmediateTypeFormat.class)
public class SltiuCommand<T extends Register<T>> extends ThreeArgumentCommand<T> {

    /**
     * Creates the {@code SLTIU} command for a kernel.
     *
     * @param cpu kernel that provides access to registers and memory
     */
    public SltiuCommand(KernelCommand<T> cpu) {
        super(cpu);
    }

    @Override
    public void startPrecondition() {

    }

    @Override
    public void startAction() {

    }
}
