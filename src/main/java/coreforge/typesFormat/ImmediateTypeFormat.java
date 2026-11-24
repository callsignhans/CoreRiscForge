package coreforge.typesFormat;

import java.util.List;
import coreforge.KernelCommand;
import coreforge.Register;

/**
 * Registers RISC-V I-type commands. Opcode and operand extraction are still stubs.
 *
 * @param <T> register implementation used by the kernel
 */
public class ImmediateTypeFormat<T extends Register<T>> extends TypeCommandFormat<T> {

    /**
     * Registers commands for the given I-type base opcode.
     *
     * @param opcode seven-bit base opcode to register
     * @param cpu kernel that provides access to registers and memory
     * @param subPackages instruction package names relative to {@code coreforge.commands}
     * @throws IllegalArgumentException if instruction registration finds a conflict or an incompatible constructor
     */
    public ImmediateTypeFormat(int opcode, KernelCommand<T> cpu, List<String> subPackages) {
        super(opcode, cpu, subPackages);
    }

    @Override
    protected int getOpcodeFromCommand(byte[] command) {
        return 0;
    }

    @Override
    protected int getCountArg() {
        return 0;
    }

    @Override
    protected void getArgs(int[] outputArray, byte[] command) {

    }
}
