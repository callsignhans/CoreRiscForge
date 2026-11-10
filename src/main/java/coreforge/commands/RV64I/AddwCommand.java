package coreforge.commands.RV64I;

import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.typesFormat.RegisterTypeFormat;

@RiscVCommand(opcode = 0b00000000000111011, type = RegisterTypeFormat.class)
public class AddwCommand<T extends Register<T>> extends Command<T> {
}
