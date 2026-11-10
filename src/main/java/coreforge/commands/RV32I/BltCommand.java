package coreforge.commands.RV32I;

import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.typesFormat.BranchTypeFormat;

@RiscVCommand(opcode = 0b1001100011, type = BranchTypeFormat.class)
public class BltCommand<T extends Register<T>> extends Command<T> {
}
