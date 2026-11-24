package coreforge.typesFormat;

import java.util.List;
import coreforge.KernelCommand;
import coreforge.Register;

/**
 * Decodes RISC-V R-type opcodes and register operands.
 *
 * @param <T> register implementation used by the kernel
 */
public class RegisterTypeFormat<T extends Register<T>> extends TypeCommandFormat<T> {
    /**
     * Registers commands for the given R-type base opcode.
     *
     * @param opcode seven-bit base opcode to register
     * @param kernel kernel that provides access to registers and memory
     * @param subPackages instruction package names relative to {@code coreforge.commands}
     * @throws IllegalArgumentException if instruction registration finds a conflict or an incompatible constructor
     */
    public RegisterTypeFormat(int opcode, KernelCommand<T> kernel, List<String> subPackages) {
        super(opcode, kernel, subPackages);
    }

    @Override
    protected int getOpcodeFromCommand(byte[] command) {
        return (((command[0] >> 1) & 0b1111111) << 10) +
                (((command[2] >> 4) & 0b111) << 7) +
                (command[3] & 0b01111111);
    }

    @Override
    protected int getCountArg() {
        return 3;
    }

    @Override
    protected void getArgs(int[] outputArray, byte[] command) {
        args[0] = (command[3] >> 7 & 0b1) + ((command[2] & 0b1111) << 1);
        args[1] = (command[2] >> 7 & 0b1) + ((command[1] & 0b1111) << 1);
        args[2] = (command[1] >> 4 & 0b1111) + ((command[0] & 0b1) << 4);

    }
}
