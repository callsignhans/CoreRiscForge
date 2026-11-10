package coreforge.commands.RV32I;

import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.typesFormat.UpperImmediateTypeFormat;

@RiscVCommand(opcode = 0b0110111, type = UpperImmediateTypeFormat.class)
public class LuiCommand<T extends Register<T>> extends Command<T> {

}
