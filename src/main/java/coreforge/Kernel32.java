package coreforge;

import java.util.ArrayList;
import java.util.List;

public class Kernel32 implements KernelCommand {

    List<Register> regs = new ArrayList<Register>();

    public Kernel32() {
        for (int i = 0; i < 32; i++) {
            regs.add(new Register32(i));
        }
    }

    @Override
    public Register readReg(int num) {
        return regs.get(num);
    }

    @Override
    public void writeReg(int num, Register val) {
        regs.set(num, val);
    }

    @Override
    public byte readRamByte(int num) {
        return 0;
    }

    @Override
    public short readRamShort(int num) {
        return 0;
    }

    @Override
    public int readRamInt(int num) {
        return 0;
    }

    @Override
    public long readRamLong(int num) {
        return 0;
    }

    @Override
    public void writeRamByte(int num, byte val) {

    }

    @Override
    public void writeRamShort(int num, short val) {

    }

    @Override
    public void writeRamInt(int num, int val) {

    }

    @Override
    public void writeRamLong(int num, long val) {

    }
}
