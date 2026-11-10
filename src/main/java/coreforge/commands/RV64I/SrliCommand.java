package coreforge.commands.RV64I;

import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.typesFormat.ImmediateTypeFormat;

@RiscVCommand(opcode = 0b0000001010010011, type = ImmediateTypeFormat.class)
public class SrliCommand<T extends Register<T>> extends Command<T> {
}
