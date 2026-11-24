package coreforge.commands.RV32I;

import coreforge.KernelCommand;
import coreforge.Register;
import coreforge.commands.RiscVCommand;
import coreforge.commands.ThreeArgumentCommand;
import coreforge.typesFormat.RegisterTypeFormat;

/**
 * Represents the RV32I {@code SRA} instruction.
 *
 * <p>In RISC-V, this instruction shifts a register right arithmetically by a register-specified amount.
 * The execution method is currently a stub.
 *
 * @param <T> register implementation used by the kernel
 */
@RiscVCommand(opcode = 0b01000001010110011, type = RegisterTypeFormat.class)
public class SraCommand<T extends Register<T>> extends ThreeArgumentCommand<T> {
    /**
     * Creates the {@code SRA} command for a kernel.
     *
     * @param cpu kernel that provides access to registers and memory
     */
    public SraCommand(KernelCommand<T> cpu) {
        super(cpu);
    }

    @Override
    public void startPrecondition() {

    }

    @Override
    public void startAction() {

    }
}
