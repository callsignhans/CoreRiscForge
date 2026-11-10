package coreforge.commands.RV32I;

import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.typesFormat.RegisterTypeFormat;

@RiscVCommand(opcode = 0b01000000000110011, type = RegisterTypeFormat.class)
public class SubCommand<T extends Register<T>> extends Command<T> {
}
