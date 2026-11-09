package coreforge;

public interface KernelCommand<T extends  Register<T>> {
    T readReg(int num);
    void writeReg(int num, T val);
    byte readRamByte(int num);
    short readRamShort(int num);
    int readRamInt(int num);
    long readRamLong(int num);
    void writeRamByte(int num, byte val);
    void writeRamShort(int num, short val);
    void writeRamInt(int num, int val);
    void writeRamLong(int num, long val);
}
