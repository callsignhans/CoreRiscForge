package coreforge;

/**
 * Provides the register and memory operations used by instructions.
 *
 * @param <T> register implementation used by the kernel
 */
public interface KernelCommand<T extends  Register<T>> {
    /**
     * Reads a register.
     *
     * @param num register index
     * @return register at the given index
     */
    T readReg(int num);

    /**
     * Replaces a register value.
     *
     * @param num register index
     * @param val value to store
     */
    void writeReg(int num, T val);

    /**
     * Reads a 8-bit value from memory.
     *
     * @param num starting byte address
     * @return value read from 1 consecutive byte
     */
    byte readRamByte(int num);

    /**
     * Reads a 16-bit value from memory.
     *
     * @param num starting byte address
     * @return value read from 2 consecutive bytes
     */
    short readRamShort(int num);

    /**
     * Reads a 32-bit value from memory.
     *
     * @param num starting byte address
     * @return value read from 4 consecutive bytes
     */
    int readRamInt(int num);

    /**
     * Reads a 64-bit value from memory.
     *
     * @param num starting byte address
     * @return value read from 8 consecutive bytes
     */
    long readRamLong(int num);

    /**
     * Writes a 8-bit value to memory.
     *
     * @param num starting byte address
     * @param val value to store
     */
    void writeRamByte(int num, byte val);

    /**
     * Writes a 16-bit value to memory.
     *
     * @param num starting byte address
     * @param val value to store
     */
    void writeRamShort(int num, short val);

    /**
     * Writes a 32-bit value to memory.
     *
     * @param num starting byte address
     * @param val value to store
     */
    void writeRamInt(int num, int val);

    /**
     * Writes a 64-bit value to memory.
     *
     * @param num starting byte address
     * @param val value to store
     */
    void writeRamLong(int num, long val);
}
