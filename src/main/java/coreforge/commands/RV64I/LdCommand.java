package coreforge.commands.RV64I;

import coreforge.KernelCommand;
import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.commands.ThreeArgumentCommand;
import coreforge.typesFormat.ImmediateTypeFormat;

@RiscVCommand(opcode = 0b0110000011, type = ImmediateTypeFormat.class)
public class LdCommand<T extends Register<T>> extends ThreeArgumentCommand<T> {

    public LdCommand(KernelCommand<T> cpu) {
        super(cpu);
    }

    @Override
    public void startPrecondition() {

    }

    @Override
    public void startAction() {

    }
}
