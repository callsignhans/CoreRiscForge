package coreforge.commands.RV32I;

import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.typesFormat.UpperImmediateTypeFormat;

@RiscVCommand(opcode = 0b0010111, type = UpperImmediateTypeFormat.class)
public class AuipcCommand<T extends Register<T>> extends Command<T> {
}
