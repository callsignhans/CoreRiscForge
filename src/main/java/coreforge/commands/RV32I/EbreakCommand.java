package coreforge.commands.RV32I;

import coreforge.KernelCommand;
import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.commands.ThreeArgumentCommand;
import coreforge.typesFormat.ImmediateTypeFormat;

// immediate hardcoded (last 12 bits)
/**
 * Represents the RV32I {@code EBREAK} instruction.
 *
 * <p>In RISC-V, this instruction raises a breakpoint exception.
 * The execution method is currently a stub.
 *
 * @param <T> register implementation used by the kernel
 */
@RiscVCommand(opcode = 0b0001110011, type = ImmediateTypeFormat.class)
public class EbreakCommand<T extends Register<T>> extends ThreeArgumentCommand<T> {

    /**
     * Creates the {@code EBREAK} command for a kernel.
     *
     * @param cpu kernel that provides access to registers and memory
     */
    public EbreakCommand(KernelCommand<T> cpu) {
        super(cpu);
    }

    @Override
    public void startPrecondition() {

    }

    @Override
    public void startAction() {

    }
}
