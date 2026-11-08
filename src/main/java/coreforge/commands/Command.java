package coreforge.commands;

import coreforge.KernelCommand;

public abstract class Command {
    protected KernelCommand cpu;
    protected int levelPrivilege;

    public Command (KernelCommand cpu){
        this.cpu = cpu;
    }

    public abstract void setValue(int[] data);
    public abstract void startPrecondition();
    public abstract void startAction();

}
