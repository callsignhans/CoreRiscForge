package coreforge.commands.RV32I;

import coreforge.KernelCommand;
import coreforge.Register;
import coreforge.commands.ThreeArgumentCommand;
import coreforge.commands.RiscVCommand;
import coreforge.typesFormat.RegisterTypeFormat;

/**
 * Represents the RV32I {@code SLL} instruction.
 *
 * <p>In RISC-V, this instruction shifts a register left by a register-specified amount, filling with zeros.
 * The execution method is currently a stub.
 *
 * @param <T> register implementation used by the kernel
 */
@RiscVCommand(opcode = 0b00000000010110011, type = RegisterTypeFormat.class)
public class SllCommand<T extends Register<T>> extends ThreeArgumentCommand<T> {
    /**
     * Creates the {@code SLL} command for a kernel.
     *
     * @param cpu kernel that provides access to registers and memory
     */
    public SllCommand(KernelCommand<T> cpu) {
        super(cpu);
    }

    @Override
    public void startPrecondition() {

    }

    @Override
    public void startAction() {

    }
}
