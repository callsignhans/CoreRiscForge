package coreforge.commands.RV32I;

import coreforge.KernelCommand;
import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.commands.ThreeArgumentCommand;
import coreforge.typesFormat.StoreTypeFormat;

/**
 * Represents the RV32I {@code SW} instruction.
 *
 * <p>In RISC-V, this instruction stores the low 32 bits of a register to memory.
 * The execution method is currently a stub.
 *
 * @param <T> register implementation used by the kernel
 */
@RiscVCommand(opcode = 0b0100100011, type = StoreTypeFormat.class)
public class SwCommand<T extends Register<T>> extends ThreeArgumentCommand<T> {

    /**
     * Creates the {@code SW} command for a kernel.
     *
     * @param cpu kernel that provides access to registers and memory
     */
    public SwCommand(KernelCommand<T> cpu) {
        super(cpu);
    }

    @Override
    public void startPrecondition() {

    }

    @Override
    public void startAction() {

    }
}
