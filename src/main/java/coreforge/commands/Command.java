package coreforge.commands;

import coreforge.KernelCommand;
import coreforge.Register;

public abstract class Command<T extends Register<T>> {
    protected KernelCommand<T> cpu;
    protected int levelPrivilege;

public Command (KernelCommand<T> cpu){
        this.cpu = cpu;
    }

    public abstract void setValue(int[] data);
    public abstract void startPrecondition();
    public abstract void startAction();

}
