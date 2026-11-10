package coreforge.commands.RV32I;

import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.typesFormat.StoreTypeFormat;

@RiscVCommand(opcode = 0b0010100011, type = StoreTypeFormat.class)
public class ShCommand<T extends Register<T>> extends Command<T> {
}
