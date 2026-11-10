package coreforge.commands.RV64I;

import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.typesFormat.RegisterTypeFormat;

@RiscVCommand(opcode = 0b01000001010111011, type = RegisterTypeFormat.class)
public class SrawCommand<T extends Register<T>> extends Command<T> {
}
