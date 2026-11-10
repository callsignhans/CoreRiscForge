package coreforge.commands.RV64I;

import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.typesFormat.ImmediateTypeFormat;

@RiscVCommand(opcode = 0b01000001010011011, type = ImmediateTypeFormat.class)
public class SraiwCommand<T extends Register<T>> extends Command<T> {
}
