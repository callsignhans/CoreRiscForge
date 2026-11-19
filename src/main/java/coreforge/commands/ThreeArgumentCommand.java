package coreforge.commands;

import coreforge.KernelCommand;
import coreforge.Register;

public abstract class ThreeArgumentCommand<T extends Register<T>> extends Command<T> {
    protected int result;
    protected int argumentOne;
    protected int argumentTwo;

    public ThreeArgumentCommand(KernelCommand<T> cpu) {
        super(cpu);
    }

    @Override
    public final void setValue(int[] data) {
        result = data[0];
        argumentOne = data[1];
        argumentTwo = data[2];
    }
}
