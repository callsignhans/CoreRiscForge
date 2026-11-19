package coreforge.commands.RV32I;

import coreforge.KernelCommand;
import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.commands.ThreeArgumentCommand;
import coreforge.typesFormat.StoreTypeFormat;

@RiscVCommand(opcode = 0b0000100011, type = StoreTypeFormat.class)
public class SbCommand<T extends Register<T>> extends ThreeArgumentCommand<T> {

    public SbCommand(KernelCommand<T> cpu) {
        super(cpu);
    }

    @Override
    public void startPrecondition() {

    }

    @Override
    public void startAction() {

    }
}
