package coreforge.commands.RV32I;

import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.typesFormat.BranchTypeFormat;

@RiscVCommand(opcode = 0b0001100011, type = BranchTypeFormat.class)
public class BeqCommand<T extends Register<T>> extends Command<T> {
}
