package coreforge.commands.RV64I;

import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.typesFormat.ImmediateTypeFormat;

@RiscVCommand(opcode = 0b0000000010010011, type = ImmediateTypeFormat.class)
public class SlliCommand<T extends Register<T>> extends Command<T> {
}
