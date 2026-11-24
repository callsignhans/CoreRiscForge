package coreforge.commands.RV32I;


import coreforge.KernelCommand;
import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.commands.TwoArgumentCommand;
import coreforge.typesFormat.JumpTypeFormat;

/**
 * Represents the RV32I {@code JAL} instruction.
 *
 * <p>In RISC-V, this instruction jumps to a PC-relative target and saves the return address.
 * The execution method is currently a stub.
 *
 * @param <T> register implementation used by the kernel
 */
@RiscVCommand(opcode = 0b1101111, type = JumpTypeFormat.class)
public class JalCommand<T extends Register<T>> extends TwoArgumentCommand<T> {
    /**
     * Creates the {@code JAL} command for a kernel.
     *
     * @param cpu kernel that provides access to registers and memory
     */
    public JalCommand(KernelCommand<T> cpu) {
        super(cpu);
    }

    @Override
    public void startPrecondition() {

    }

    @Override
    public void startAction() {

    }
}
