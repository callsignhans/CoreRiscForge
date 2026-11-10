package coreforge.commands.RV32I;

import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.typesFormat.RegisterTypeFormat;

@RiscVCommand(opcode = 0b00000001100110011, type = RegisterTypeFormat.class)
public class OrCommand<T extends Register<T>> extends Command<T> {
}
