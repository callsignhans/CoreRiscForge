package coreforge.commands.RV32I;

import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.typesFormat.ImmediateTypeFormat;

// immediate hardcoded (last 12 bits)
@RiscVCommand(opcode = 0b0000000000000001110011, type = ImmediateTypeFormat.class)
public class EcallCommand<T extends Register<T>> extends Command<T> {
}
