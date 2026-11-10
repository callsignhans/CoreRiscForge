package coreforge.commands.RV32I;

import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.typesFormat.RegisterTypeFormat;

@RiscVCommand(opcode = 0b00000000110110011, type = RegisterTypeFormat.class)
public class SltuCommand<T extends Register<T>> extends Command<T> {
}
