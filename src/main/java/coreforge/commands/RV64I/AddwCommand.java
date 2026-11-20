package coreforge.commands.RV64I;

import coreforge.KernelCommand;
import coreforge.Register;
import coreforge.commands.RiscVCommand;
import coreforge.commands.ThreeArgumentCommand;
import coreforge.typesFormat.RegisterTypeFormat;

@RiscVCommand(opcode = 0b00000000000111011, type = RegisterTypeFormat.class)
public class AddwCommand<T extends Register<T>> extends ThreeArgumentCommand<T> {

    public AddwCommand(KernelCommand<T> cpu) {
        super(cpu);
    }

    @Override
    public void startPrecondition() {

    }

    @Override
    public void startAction() {

    }
}
