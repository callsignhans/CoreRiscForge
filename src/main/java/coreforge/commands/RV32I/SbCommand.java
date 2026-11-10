package coreforge.commands.RV32I;

import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.typesFormat.StoreTypeFormat;

@RiscVCommand(opcode = 0b0000100011, type = StoreTypeFormat.class)
public class SbCommand<T extends Register<T>> extends Command<T> {
}
