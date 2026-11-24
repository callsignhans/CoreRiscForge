package coreforge.commands.RV32I;

import coreforge.KernelCommand;
import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.commands.ThreeArgumentCommand;
import coreforge.typesFormat.ImmediateTypeFormat;

// immediate hardcoded (last 12 bits)
/**
 * Represents the RV32I {@code ECALL} instruction.
 *
 * <p>In RISC-V, this instruction requests a service from the execution environment.
 * The execution method is currently a stub.
 *
 * @param <T> register implementation used by the kernel
 */
@RiscVCommand(opcode = 0b0001110011, type = ImmediateTypeFormat.class)
public class EcallCommand<T extends Register<T>> extends ThreeArgumentCommand<T> {
    /**
     * Creates the {@code ECALL} command for a kernel.
     *
     * @param cpu kernel that provides access to registers and memory
     */
    public EcallCommand(KernelCommand<T> cpu) {
        super(cpu);
    }

    @Override
    public void startPrecondition() {

    }

    @Override
    public void startAction() {

    }
}
