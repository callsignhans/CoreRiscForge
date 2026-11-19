package coreforge.commands.RV32I;

import coreforge.KernelCommand;
import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.commands.ThreeArgumentCommand;
import coreforge.typesFormat.BranchTypeFormat;

@RiscVCommand(opcode = 0b0011100011, type = BranchTypeFormat.class)
public class BneCommand<T extends Register<T>> extends ThreeArgumentCommand<T> {
    public BneCommand(KernelCommand<T> cpu) {
        super(cpu);
    }

    @Override
    public void startPrecondition() {

    }

    @Override
    public void startAction() {

    }
}
