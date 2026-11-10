package coreforge.commands.RV32I;

import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.typesFormat.ImmediateTypeFormat;

@RiscVCommand(opcode = 0b1100010011, type = ImmediateTypeFormat.class)
public class OriCommand<T extends Register<T>> extends Command<T> {
}
