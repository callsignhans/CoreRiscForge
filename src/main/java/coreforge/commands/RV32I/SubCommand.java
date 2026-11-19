package coreforge.commands.RV32I;

import coreforge.KernelCommand;
import coreforge.Register;
import coreforge.commands.ThreeArgumentCommand;
import coreforge.commands.RiscVCommand;
import coreforge.typesFormat.RegisterTypeFormat;

@RiscVCommand(opcode = 0b01000000000110011, type = RegisterTypeFormat.class)
public class SubCommand<T extends Register<T>> extends ThreeArgumentCommand<T> {
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
