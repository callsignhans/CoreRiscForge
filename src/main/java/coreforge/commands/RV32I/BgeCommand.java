package coreforge.commands.RV32I;

import coreforge.KernelCommand;
import coreforge.Register;
import coreforge.commands.RiscVCommand;
import coreforge.commands.ThreeArgumentCommand;
import coreforge.typesFormat.BranchTypeFormat;

@RiscVCommand(opcode = 0b1011100011, type = BranchTypeFormat.class)
public class BgeCommand<T extends Register<T>> extends ThreeArgumentCommand<T> {
    public BgeCommand(KernelCommand<T> cpu) {
        super(cpu);
    }

    @Override
    public void startPrecondition() {

    }

    @Override
    public void startAction() {

    }
}
