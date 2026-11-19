package coreforge.commands.RV32I;

import coreforge.KernelCommand;
import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.commands.ThreeArgumentCommand;
import coreforge.typesFormat.ImmediateTypeFormat;

// immediate hardcoded (last 12 bits)
@RiscVCommand(opcode = 0b0000000100000000001111, type = ImmediateTypeFormat.class)
public class PauseCommand<T extends Register<T>> extends ThreeArgumentCommand<T> {

    public PauseCommand(KernelCommand<T> cpu) {
        super(cpu);
    }

    @Override
    public void startPrecondition() {

    }

    @Override
    public void startAction() {

    }
}
