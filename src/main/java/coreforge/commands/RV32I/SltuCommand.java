package coreforge.commands.RV32I;

import coreforge.KernelCommand;
import coreforge.Register;
import coreforge.commands.RiscVCommand;
import coreforge.commands.ThreeArgumentCommand;
import coreforge.typesFormat.RegisterTypeFormat;

/**
 * Represents the RV32I {@code SLTU} instruction.
 *
 * <p>In RISC-V, this instruction tests whether the first unsigned register value is less than the
 * second and writes 1 or 0.
 * The execution method is currently a stub.
 *
 * @param <T> register implementation used by the kernel
 */
@RiscVCommand(opcode = 0b00000000110110011, type = RegisterTypeFormat.class)
public class SltuCommand<T extends Register<T>> extends ThreeArgumentCommand<T> {
    /**
     * Creates the {@code SLTU} command for a kernel.
     *
     * @param cpu kernel that provides access to registers and memory
     */
    public SltuCommand(KernelCommand<T> cpu) {
        super(cpu);
    }

    @Override
    public void startPrecondition() {

    }

    @Override
    public void startAction() {

    }
}
