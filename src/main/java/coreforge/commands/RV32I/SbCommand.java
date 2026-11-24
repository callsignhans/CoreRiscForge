package coreforge.commands.RV32I;

import coreforge.KernelCommand;
import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.commands.ThreeArgumentCommand;
import coreforge.typesFormat.StoreTypeFormat;

/**
 * Represents the RV32I {@code SB} instruction.
 *
 * <p>In RISC-V, this instruction stores the low 8 bits of a register to memory.
 * The execution method is currently a stub.
 *
 * @param <T> register implementation used by the kernel
 */
@RiscVCommand(opcode = 0b0000100011, type = StoreTypeFormat.class)
public class SbCommand<T extends Register<T>> extends ThreeArgumentCommand<T> {

    /**
     * Creates the {@code SB} command for a kernel.
     *
     * @param cpu kernel that provides access to registers and memory
     */
    public SbCommand(KernelCommand<T> cpu) {
        super(cpu);
    }

    @Override
    public void startPrecondition() {

    }

    @Override
    public void startAction() {

    }
}
