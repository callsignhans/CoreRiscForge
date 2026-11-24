package coreforge;

import java.util.List;
import java.util.stream.Stream;

/**
 * Provides read access to kernel registers and memory for debugging.
 */
public interface KernelDebug {
    /**
     * Captures the current register values.
     *
     * @return register indices and their current values
     */
    List<RegisterValue> dumpRegisters();

    /**
     * Reads consecutive cells of the requested width.
     *
     * @param startAddress byte address of the first cell
     * @param count number of cells to read
     * @param width size of each cell
     * @return cells in ascending address order
     * @throws IllegalArgumentException if the address range or cell count is invalid
     */
    Stream<MemoryCell> dumpMemory(long startAddress, int count, DumpWidth width);

    /**
     * A register value captured by the debugger.
     *
     * @param index register index
     * @param value register bits represented as a long
     */
    record RegisterValue(int index, long value) {}

    /**
     * A memory cell captured by the debugger.
     *
     * @param address byte address of the cell
     * @param value cell bits represented as a long
     */
    record MemoryCell(long address, long value) {}

    /**
     * Supported sizes for cells in a memory dump.
     */
    enum DumpWidth {
        /**
         * 8-bit memory cells.
         */
        BYTE(1),

        /**
         * 16-bit memory cells.
         */
        SHORT(2),

        /**
         * 32-bit memory cells.
         */
        INT(4),

        /**
         * 64-bit memory cells.
         */
        LONG(8);

        private final int bytes;

        /**
         * Defines a cell width in bytes.
         *
         * @param bytes number of bytes per cell
         */
        DumpWidth(int bytes) {
            this.bytes = bytes;
        }

        /**
         * Returns the size of a memory cell.
         *
         * @return number of bytes per cell
         */
        public int bytes() {
            return bytes;
        }
    }
}
