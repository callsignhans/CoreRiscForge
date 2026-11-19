package coreforge.commands.RV32I;

import coreforge.KernelCommand;
import coreforge.Register;
import coreforge.commands.RiscVCommand;
import coreforge.commands.TwoArgumentCommand;
import coreforge.typesFormat.UpperImmediateTypeFormat;

@RiscVCommand(opcode = 0b0010111, type = UpperImmediateTypeFormat.class)
public class AuipcCommand<T extends Register<T>> extends TwoArgumentCommand<T> {
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
