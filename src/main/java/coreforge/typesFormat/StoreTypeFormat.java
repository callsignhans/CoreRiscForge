package coreforge.typesFormat;

import java.util.List;
import coreforge.KernelCommand;
import coreforge.Register;

public class StoreTypeFormat<T extends Register<T>> extends TypeCommandFormat<T> {

    public StoreTypeFormat(int opcode, KernelCommand<T> cpu, List<String> subPackages) {
        super(opcode, cpu, subPackages);
    }

    @Override
    protected int getOpcodeFromCommand(byte[] command) {
        return 0;
    }

    @Override
    protected int getCountArg() {
        return 0;
    }

    @Override
    protected void getArgs(int[] outputArray, byte[] command) {

    }
}
