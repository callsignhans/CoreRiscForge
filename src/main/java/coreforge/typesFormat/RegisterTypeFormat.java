package coreforge.typesFormat;

import coreforge.KernelCommand;
import coreforge.Register;

public class RegisterTypeFormat<T extends Register<T>> extends TypeCommandFormat<T> {
    public RegisterTypeFormat(int opcode, KernelCommand<T> kernel){
        super(opcode, kernel);
    }

    @Override
    protected int getOpcodeFromCommand(byte[] command) {
        return (((command[0] >> 1) & 0b1111111) << 10) +
            (((command[2] >> 4) & 0b111) << 7) +
            (command[3] & 0b01111111);
    }

    @Override
    protected int getCountArg() {
        return 3;
    }

    @Override
    protected void getArgs(int[] outputArray, byte[] command) {
        args[0] = (command[3] >> 7 & 0b1) + ((command[2] & 0b1111) << 1);
        args[1] = (command[2] >> 7 & 0b1) + ((command[1] & 0b1111) << 1);
        args[2] = (command[1] >> 4 & 0b1111) + ((command[0] & 0b1) << 4);

    }
}
