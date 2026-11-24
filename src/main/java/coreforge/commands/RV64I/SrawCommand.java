package coreforge.commands.RV64I;

import coreforge.KernelCommand;
import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.commands.ThreeArgumentCommand;
import coreforge.typesFormat.RegisterTypeFormat;

/**
 * Represents the RV64I {@code SRAW} instruction.
 *
 * <p>In RISC-V, this instruction shifts the low 32 bits right arithmetically by a register-specified amount and sign-extends the result.
 * The execution method is currently a stub.
 *
 * @param <T> register implementation used by the kernel
 */
@RiscVCommand(opcode = 0b01000001010111011, type = RegisterTypeFormat.class)
public class SrawCommand<T extends Register<T>> extends ThreeArgumentCommand<T> {

    /**
     * Creates the {@code SRAW} command for a kernel.
     *
     * @param cpu kernel that provides access to registers and memory
     */
    public SrawCommand(KernelCommand<T> cpu) {
        super(cpu);
    }

    @Override
    public void startPrecondition() {

    }

    @Override
    public void startAction() {

    }
}
