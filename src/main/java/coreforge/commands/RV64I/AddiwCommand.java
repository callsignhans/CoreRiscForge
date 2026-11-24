package coreforge.commands.RV64I;

import coreforge.KernelCommand;
import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.commands.ThreeArgumentCommand;
import coreforge.typesFormat.ImmediateTypeFormat;

/**
 * Represents the RV64I {@code ADDIW} instruction.
 *
 * <p>In RISC-V, this instruction adds a sign-extended immediate and sign-extends the low 32 bits of the result.
 * The execution method is currently a stub.
 *
 * @param <T> register implementation used by the kernel
 */
@RiscVCommand(opcode = 0b0000011011, type = ImmediateTypeFormat.class)
public class AddiwCommand<T extends Register<T>> extends ThreeArgumentCommand<T> {

    /**
     * Creates the {@code ADDIW} command for a kernel.
     *
     * @param cpu kernel that provides access to registers and memory
     */
    public AddiwCommand(KernelCommand<T> cpu) {
        super(cpu);
    }

    @Override
    public void startPrecondition() {

    }

    @Override
    public void startAction() {

    }
}
