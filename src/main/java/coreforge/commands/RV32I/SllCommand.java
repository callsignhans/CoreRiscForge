package coreforge.commands.RV32I;

import coreforge.KernelCommand;
import coreforge.Register;
import coreforge.commands.ThreeArgumentCommand;
import coreforge.commands.RiscVCommand;
import coreforge.typesFormat.RegisterTypeFormat;

@RiscVCommand(opcode = 0b00000000010110011, type = RegisterTypeFormat.class)
public class SllCommand<T extends Register<T>> extends ThreeArgumentCommand<T> {
    public SllCommand(KernelCommand<T> cpu) {
        super(cpu);
    }

    @Override
    public void startPrecondition() {

    }

    @Override
    public void startAction() {

    }
}
