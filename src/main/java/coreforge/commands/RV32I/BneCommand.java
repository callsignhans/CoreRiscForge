package coreforge.commands.RV32I;

import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.typesFormat.BranchTypeFormat;

@RiscVCommand(opcode = 0b0011100011, type = BranchTypeFormat.class)
public class BneCommand<T extends Register<T>> extends Command<T> {
}
