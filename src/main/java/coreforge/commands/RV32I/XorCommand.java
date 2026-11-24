package coreforge.commands.RV32I;

import coreforge.KernelCommand;
import coreforge.Register;
import coreforge.commands.RiscVCommand;
import coreforge.commands.ThreeArgumentCommand;
import coreforge.typesFormat.RegisterTypeFormat;

/**
 * Represents the RV32I {@code XOR} instruction.
 *
 * <p>In RISC-V, this instruction computes the bitwise XOR of two registers.
 * The execution method is currently a stub.
 *
 * @param <T> register implementation used by the kernel
 */
@RiscVCommand(opcode = 0b00000001000110011, type = RegisterTypeFormat.class)
public class XorCommand<T extends Register<T>> extends ThreeArgumentCommand<T> {
    /**
     * Creates the {@code XOR} command for a kernel.
     *
     * @param cpu kernel that provides access to registers and memory
     */
    public XorCommand(KernelCommand<T> cpu) {
        super(cpu);
    }

    @Override
    public void startPrecondition() {

    }

    @Override
    public void startAction() {

    }
}
