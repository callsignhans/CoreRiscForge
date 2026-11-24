package coreforge.commands.RV32I;

import coreforge.KernelCommand;
import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.commands.ThreeArgumentCommand;
import coreforge.typesFormat.ImmediateTypeFormat;

/**
 * Represents the RV32I {@code SLTI} instruction.
 *
 * <p>In RISC-V, this instruction tests whether a signed register value is less than an immediate and writes 1 or 0.
 * The execution method is currently a stub.
 *
 * @param <T> register implementation used by the kernel
 */
@RiscVCommand(opcode = 0b0100010011, type = ImmediateTypeFormat.class)
public class SltiCommand<T extends Register<T>> extends ThreeArgumentCommand<T> {

    /**
     * Creates the {@code SLTI} command for a kernel.
     *
     * @param cpu kernel that provides access to registers and memory
     */
    public SltiCommand(KernelCommand<T> cpu) {
        super(cpu);
    }

    @Override
    public void startPrecondition() {

    }

    @Override
    public void startAction() {

    }
}
