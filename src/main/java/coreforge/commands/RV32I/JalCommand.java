package coreforge.commands.RV32I;


import coreforge.KernelCommand;
import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.commands.TwoArgumentCommand;
import coreforge.typesFormat.JumpTypeFormat;

@RiscVCommand(opcode = 0b1101111, type = JumpTypeFormat.class)
public class JalCommand<T extends Register<T>> extends TwoArgumentCommand<T> {
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
