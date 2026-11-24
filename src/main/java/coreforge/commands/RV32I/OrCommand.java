package coreforge.commands.RV32I;

import coreforge.KernelCommand;
import coreforge.Register;
import coreforge.commands.RiscVCommand;
import coreforge.commands.ThreeArgumentCommand;
import coreforge.typesFormat.RegisterTypeFormat;

/**
 * Represents the RV32I {@code OR} instruction.
 *
 * <p>In RISC-V, this instruction computes the bitwise OR of two registers.
 * The execution method is currently a stub.
 *
 * @param <T> register implementation used by the kernel
 */
@RiscVCommand(opcode = 0b00000001100110011, type = RegisterTypeFormat.class)
public class OrCommand<T extends Register<T>> extends ThreeArgumentCommand<T> {
    /**
     * Creates the {@code OR} command for a kernel.
     *
     * @param cpu kernel that provides access to registers and memory
     */
    public OrCommand(KernelCommand<T> cpu) {
        super(cpu);
    }

    @Override
    public void startPrecondition() {

    }

    @Override
    public void startAction() {

    }
}
