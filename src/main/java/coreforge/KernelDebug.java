package coreforge;

import java.util.List;
import java.util.stream.Stream;

public interface KernelDebug {
    List<RegisterValue> dumpRegisters();

    Stream<MemoryCell> dumpMemory(long startAddress, int count, DumpWidth width);

    record RegisterValue(int index, long value) {}

    record MemoryCell(long address, long value) {}

    enum DumpWidth {
        BYTE(1), SHORT(2), INT(4), LONG(8);

        private final int bytes;

        DumpWidth(int bytes) {
            this.bytes = bytes;
        }

        public int bytes() {
            return bytes;
        }
    }
}
