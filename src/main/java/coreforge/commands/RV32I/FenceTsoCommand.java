package coreforge.commands.RV32I;

import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.typesFormat.ImmediateTypeFormat;

//immediate hardcoded (last 12 bits)
@RiscVCommand(opcode = 0b1000001100110000001111, type = ImmediateTypeFormat.class)
public class FenceTsoCommand<T extends Register<T>> extends Command<T> {
}
