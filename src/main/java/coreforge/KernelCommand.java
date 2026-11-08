package coreforge;

public interface KernelCommand {
    Register readReg(int num);
    void writeReg(int num, Register val);
    byte readRamByte(int num);
    short readRamShort(int num);
    int readRamInt(int num);
    long readRamLong(int num);
    void writeRamByte(int num, byte val);
    void writeRamShort(int num, short val);
    void writeRamInt(int num, int val);
    void writeRamLong(int num, long val);
}
