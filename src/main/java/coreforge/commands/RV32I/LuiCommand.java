package coreforge.commands.RV32I;

import coreforge.KernelCommand;
import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.commands.TwoArgumentCommand;
import coreforge.typesFormat.UpperImmediateTypeFormat;

@RiscVCommand(opcode = 0b0110111, type = UpperImmediateTypeFormat.class)
public class LuiCommand<T extends Register<T>> extends TwoArgumentCommand<T> {

    public LuiCommand(KernelCommand<T> cpu) {
        super(cpu);
    }

    @Override
    public void startPrecondition() {

    }

    @Override
    public void startAction() {

    }
}
