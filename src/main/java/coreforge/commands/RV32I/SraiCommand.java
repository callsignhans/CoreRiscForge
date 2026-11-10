package coreforge.commands.RV32I;

import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.typesFormat.ImmediateTypeFormat;

@RiscVCommand(opcode = 0b01000001010010011, type = ImmediateTypeFormat.class)
public class SraiCommand<T extends Register<T>> extends Command<T> {
}
