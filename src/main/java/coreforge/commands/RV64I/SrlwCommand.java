package coreforge.commands.RV64I;

import coreforge.KernelCommand;
import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.commands.ThreeArgumentCommand;
import coreforge.typesFormat.RegisterTypeFormat;

/**
 * Represents the RV64I {@code SRLW} instruction.
 *
 * <p>In RISC-V, this instruction shifts the low 32 bits right logically by a register-specified amount and sign-extends the result.
 * The execution method is currently a stub.
 *
 * @param <T> register implementation used by the kernel
 */
@RiscVCommand(opcode = 0b00000001010111011, type = RegisterTypeFormat.class)
public class SrlwCommand<T extends Register<T>> extends ThreeArgumentCommand<T> {

    /**
     * Creates the {@code SRLW} command for a kernel.
     *
     * @param cpu kernel that provides access to registers and memory
     */
    public SrlwCommand(KernelCommand<T> cpu) {
        super(cpu);
    }

    @Override
    public void startPrecondition() {

    }

    @Override
    public void startAction() {

    }
}
