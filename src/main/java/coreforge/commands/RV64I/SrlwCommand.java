package coreforge.commands.RV64I;

import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.typesFormat.RegisterTypeFormat;

@RiscVCommand(opcode = 0b00000001010111011, type = RegisterTypeFormat.class)
public class SrlwCommand<T extends Register<T>> extends Command<T> {
}
