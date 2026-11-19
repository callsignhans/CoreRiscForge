package coreforge.commands.RV32I;

import coreforge.KernelCommand;
import coreforge.Register;
import coreforge.commands.RiscVCommand;
import coreforge.commands.ThreeArgumentCommand;
import coreforge.typesFormat.BranchTypeFormat;

@RiscVCommand(opcode = 0b0001100011, type = BranchTypeFormat.class)
public class BeqCommand<T extends Register<T>> extends ThreeArgumentCommand<T> {
    public BeqCommand(KernelCommand<T> cpu) {
        super(cpu);
    }

    @Override
    public void startPrecondition() {

    }

    @Override
    public void startAction() {

    }
}
