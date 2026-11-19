package coreforge;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Kernel32 implements KernelCommand<Register32>, KernelDebug {
    List<Register32> regs = new ArrayList<>();

    public Kernel32() {
        for (int i = 0; i < 32; i++) {
            regs.add(new Register32(i));
        }
    }

    @Override
    public List<RegisterValue> dumpRegisters() {
        List<RegisterValue> values = new ArrayList<>(regs.size());
        for (int index = 0; index < regs.size(); index++) {
            values.add(new RegisterValue(index, Integer.toUnsignedLong(readReg(index).value)));
        }
        return List.copyOf(values);
    }

    @Override
    public Stream<MemoryCell> dumpMemory(long startAddress, int count, DumpWidth width) {
        int cellSize = width.bytes();
        long byteCount = (long) count * cellSize;
        long addressSpaceSize = 1L << Integer.SIZE;
        if (startAddress < 0 || count < 0 || startAddress > addressSpaceSize - byteCount) {
            throw new IllegalArgumentException("Dump exceeds the RV32 address range");
        }

        return IntStream.range(0, count).mapToObj(index -> {
            long address = startAddress + (long) index * cellSize;
            int addressBits = (int) address;
            long value = switch (width) {
                case BYTE -> Byte.toUnsignedLong(readRamByte(addressBits));
                case SHORT -> Short.toUnsignedLong(readRamShort(addressBits));
                case INT -> Integer.toUnsignedLong(readRamInt(addressBits));
                case LONG -> readRamLong(addressBits);
            };
            return new MemoryCell(address, value);
        });
    }

    @Override
    public Register32 readReg(int num) {
        return regs.get(num);
    }

    @Override
    public void writeReg(int num, Register32 val) {
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
