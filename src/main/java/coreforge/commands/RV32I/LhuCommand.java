package coreforge.commands.RV32I;

import coreforge.KernelCommand;
import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.commands.ThreeArgumentCommand;
import coreforge.typesFormat.ImmediateTypeFormat;

@RiscVCommand(opcode = 0b1010000011, type = ImmediateTypeFormat.class)
public class LhuCommand<T extends Register<T>> extends ThreeArgumentCommand<T> {

    public LhuCommand(KernelCommand<T> cpu) {
        super(cpu);
    }

    @Override
    public void startPrecondition() {

    }

    @Override
    public void startAction() {

    }
}
