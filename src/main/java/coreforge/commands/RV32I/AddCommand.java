package coreforge.commands.RV32I;


import coreforge.KernelCommand;
import coreforge.Register;
import coreforge.commands.ThreeArgumentCommand;
import coreforge.commands.RiscVCommand;
import coreforge.typesFormat.RegisterTypeFormat;


/**
 * Executes the RV32I {@code ADD} instruction.
 * Adds two register values and writes the sum to the destination register.
 *
 * @param <T> register implementation used by the kernel
 */
@RiscVCommand(opcode = 0b00000000000110011, type = RegisterTypeFormat.class)
public class AddCommand<T extends Register<T>> extends ThreeArgumentCommand<T> {
    /**
     * Creates the {@code ADD} command for a kernel.
     *
     * @param cpu kernel that provides access to registers and memory
     */
    public AddCommand(KernelCommand<T> cpu) {
        super(cpu);
    }

    @Override
    public void startPrecondition() {

    }

    @Override
    public void startAction() {
        cpu.writeReg(result,cpu.readReg(argumentOne)
            .add(cpu.readReg(argumentTwo)).getVal());
    }
}
