package coreforge.commands.RV32I;

import coreforge.KernelCommand;
import coreforge.Register;
import coreforge.commands.ThreeArgumentCommand;
import coreforge.commands.RiscVCommand;
import coreforge.typesFormat.RegisterTypeFormat;

/**
 * Represents the RV32I {@code SUB} instruction.
 *
 * <p>In RISC-V, this instruction subtracts the second register value from the first.
 * The execution method is currently a stub.
 *
 * @param <T> register implementation used by the kernel
 */
@RiscVCommand(opcode = 0b01000000000110011, type = RegisterTypeFormat.class)
public class SubCommand<T extends Register<T>> extends ThreeArgumentCommand<T> {
    /**
     * Creates the {@code SUB} command for a kernel.
     *
     * @param cpu kernel that provides access to registers and memory
     */
    public SubCommand(KernelCommand<T> cpu) {
        super(cpu);
    }

    @Override
    public void startPrecondition() {

    }

    @Override
    public void startAction() {

    }
}
