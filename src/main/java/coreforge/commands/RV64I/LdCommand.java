package coreforge.commands.RV64I;

import coreforge.KernelCommand;
import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.commands.ThreeArgumentCommand;
import coreforge.typesFormat.ImmediateTypeFormat;

/**
 * Represents the RV64I {@code LD} instruction.
 *
 * <p>In RISC-V, this instruction loads a 64-bit value from memory.
 * The execution method is currently a stub.
 *
 * @param <T> register implementation used by the kernel
 */
@RiscVCommand(opcode = 0b0110000011, type = ImmediateTypeFormat.class)
public class LdCommand<T extends Register<T>> extends ThreeArgumentCommand<T> {

    /**
     * Creates the {@code LD} command for a kernel.
     *
     * @param cpu kernel that provides access to registers and memory
     */
    public LdCommand(KernelCommand<T> cpu) {
        super(cpu);
    }

    @Override
    public void startPrecondition() {

    }

    @Override
    public void startAction() {

    }
}
