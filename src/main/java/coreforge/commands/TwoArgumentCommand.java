package coreforge.commands;

import coreforge.KernelCommand;
import coreforge.Register;

public abstract class TwoArgumentCommand<T extends Register<T>> extends Command<T> {
    protected int result;
    protected int argument;

    public TwoArgumentCommand(KernelCommand<T> cpu) {
        super(cpu);
    }

    @Override
    public final void setValue(int[] data) {
        result = data[0];
        argument = data[1];
    }
}
