package coreforge.commands.RV64I;

import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.typesFormat.StoreTypeFormat;

@RiscVCommand(opcode = 0b0110100011, type = StoreTypeFormat.class)
public class SdCommand<T extends Register<T>> extends Command<T> {
}
