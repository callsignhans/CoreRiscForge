package coreforge.commands.RV32I;

import coreforge.KernelCommand;
import coreforge.Register;
import coreforge.commands.RiscVCommand;
import coreforge.commands.ThreeArgumentCommand;
import coreforge.typesFormat.RegisterTypeFormat;

/**
 * Represents the RV32I {@code AND} instruction.
 *
 * <p>In RISC-V, this instruction computes the bitwise AND of two registers.
 * The execution method is currently a stub.
 *
 * @param <T> register implementation used by the kernel
 */
@RiscVCommand(opcode = 0b00000001110110011, type = RegisterTypeFormat.class)
public class AndCommand<T extends Register<T>> extends ThreeArgumentCommand<T> {
    /**
     * Creates the {@code AND} command for a kernel.
     *
     * @param cpu kernel that provides access to registers and memory
     */
    public AndCommand(KernelCommand<T> cpu) {
        super(cpu);
    }

    @Override
    public void startPrecondition() {

    }

    @Override
    public void startAction() {

    }
}
