package coreforge.commands.RV64I;

import coreforge.KernelCommand;
import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.commands.ThreeArgumentCommand;
import coreforge.typesFormat.StoreTypeFormat;

/**
 * Represents the RV64I {@code SD} instruction.
 *
 * <p>In RISC-V, this instruction stores a 64-bit register value to memory.
 * The execution method is currently a stub.
 *
 * @param <T> register implementation used by the kernel
 */
@RiscVCommand(opcode = 0b0110100011, type = StoreTypeFormat.class)
public class SdCommand<T extends Register<T>> extends ThreeArgumentCommand<T> {

    /**
     * Creates the {@code SD} command for a kernel.
     *
     * @param cpu kernel that provides access to registers and memory
     */
    public SdCommand(KernelCommand<T> cpu) {
        super(cpu);
    }

    @Override
    public void startPrecondition() {

    }

    @Override
    public void startAction() {

    }
}
