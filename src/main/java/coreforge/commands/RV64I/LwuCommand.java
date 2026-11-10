package coreforge.commands.RV64I;

import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.typesFormat.ImmediateTypeFormat;

@RiscVCommand(opcode = 0b1100000011, type = ImmediateTypeFormat.class)
public class LwuCommand<T extends Register<T>> extends Command<T> {
}
