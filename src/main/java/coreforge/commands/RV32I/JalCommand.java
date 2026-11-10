package coreforge.commands.RV32I;


import coreforge.Register;
import coreforge.commands.Command;
import coreforge.commands.RiscVCommand;
import coreforge.typesFormat.JumpTypeFormat;

@RiscVCommand(opcode = 0b1101111, type = JumpTypeFormat.class)
public class JalCommand<T extends Register<T>> extends Command<T> {
}
