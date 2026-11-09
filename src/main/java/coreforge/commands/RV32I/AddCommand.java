package coreforge.commands.RV32I;


import coreforge.KernelCommand;
import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.typesFormat.RegisterTypeFormat;


@RiscVCommand(opcode = 0b00000000000110011, type = RegisterTypeFormat.class)
public class AddCommand<T extends Register<T>> extends Command<T> {
    int resultReg;
    int register1;
    int register2;

    public AddCommand(KernelCommand<T> cpu) {
        super(cpu);
    }

    @Override
    public void setValue(int[] data) {
        resultReg = data[0];
        register1 = data[1];
        register2 = data[2];
    }

    @Override
    public void startPrecondition() {

    }

    @Override
    public void startAction() {
        cpu.writeReg(resultReg,cpu.readReg(register1).add(cpu.readReg(register2)).getVal());
    }
}
