package coreforge.commands.RV64I;

import coreforge.KernelCommand;
import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.commands.ThreeArgumentCommand;
import coreforge.typesFormat.ImmediateTypeFormat;

@RiscVCommand(opcode = 0b1100000011, type = ImmediateTypeFormat.class)
public class LwuCommand<T extends Register<T>> extends ThreeArgumentCommand<T> {

    public LwuCommand(KernelCommand<T> cpu) {
        super(cpu);
    }

    @Override
    public void startPrecondition() {

    }

    @Override
    public void startAction() {

    }
}
