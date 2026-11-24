package coreforge.commands.RV32I;

import coreforge.KernelCommand;
import coreforge.Register;
import coreforge.commands.RiscVCommand;
import coreforge.commands.TwoArgumentCommand;
import coreforge.typesFormat.UpperImmediateTypeFormat;

/**
 * Represents the RV32I {@code AUIPC} instruction.
 *
 * <p>In RISC-V, this instruction adds an upper immediate to the current instruction address.
 * The execution method is currently a stub.
 *
 * @param <T> register implementation used by the kernel
 */
@RiscVCommand(opcode = 0b0010111, type = UpperImmediateTypeFormat.class)
public class AuipcCommand<T extends Register<T>> extends TwoArgumentCommand<T> {
    /**
     * Creates the {@code AUIPC} command for a kernel.
     *
     * @param cpu kernel that provides access to registers and memory
     */
    public AuipcCommand(KernelCommand<T> cpu) {
        super(cpu);
    }

    @Override
    public void startPrecondition() {

    }

    @Override
    public void startAction() {

    }
}
