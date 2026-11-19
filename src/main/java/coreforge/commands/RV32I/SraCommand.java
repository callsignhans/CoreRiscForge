package coreforge.commands.RV32I;

import coreforge.KernelCommand;
import coreforge.Register;
import coreforge.commands.RiscVCommand;
import coreforge.commands.ThreeArgumentCommand;
import coreforge.typesFormat.RegisterTypeFormat;

@RiscVCommand(opcode = 0b01000001010110011, type = RegisterTypeFormat.class)
public class SraCommand<T extends Register<T>> extends ThreeArgumentCommand<T> {
    public SraCommand(KernelCommand<T> cpu) {
        super(cpu);
    }

    @Override
    public void startPrecondition() {

    }

    @Override
    public void startAction() {

    }
}
