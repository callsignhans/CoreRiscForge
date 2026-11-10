package coreforge.commands.RV32I;

import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.typesFormat.BranchTypeFormat;

@RiscVCommand(opcode = 0b1101100011, type = BranchTypeFormat.class)
public class BltuCommand<T extends Register<T>> extends Command<T> {
}
