package coreforge.commands.RV32I;

import coreforge.KernelCommand;
import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.commands.ThreeArgumentCommand;
import coreforge.typesFormat.ImmediateTypeFormat;

// immediate hardcoded (last 12 bits)
/**
 * Represents the RV32I {@code PAUSE} instruction.
 *
 * <p>In RISC-V, this instruction hints that the processor may pause briefly in a spin loop.
 * The execution method is currently a stub.
 *
 * @param <T> register implementation used by the kernel
 */
@RiscVCommand(opcode = 0b0000000100000000001111, type = ImmediateTypeFormat.class)
public class PauseCommand<T extends Register<T>> extends ThreeArgumentCommand<T> {

    /**
     * Creates the {@code PAUSE} command for a kernel.
     *
     * @param cpu kernel that provides access to registers and memory
     */
    public PauseCommand(KernelCommand<T> cpu) {
        super(cpu);
    }

    @Override
    public void startPrecondition() {

    }

    @Override
    public void startAction() {

    }
}
