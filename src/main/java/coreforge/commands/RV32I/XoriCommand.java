package coreforge.commands.RV32I;

import coreforge.KernelCommand;
import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.commands.ThreeArgumentCommand;
import coreforge.typesFormat.ImmediateTypeFormat;

/**
 * Represents the RV32I {@code XORI} instruction.
 *
 * <p>In RISC-V, this instruction computes the bitwise XOR of a register and a sign-extended immediate.
 * The execution method is currently a stub.
 *
 * @param <T> register implementation used by the kernel
 */
@RiscVCommand(opcode = 0b1000010011, type = ImmediateTypeFormat.class)
public class XoriCommand<T extends Register<T>> extends ThreeArgumentCommand<T> {

    /**
     * Creates the {@code XORI} command for a kernel.
     *
     * @param cpu kernel that provides access to registers and memory
     */
    public XoriCommand(KernelCommand<T> cpu) {
        super(cpu);
    }

    @Override
    public void startPrecondition() {

    }

    @Override
    public void startAction() {

    }
}
