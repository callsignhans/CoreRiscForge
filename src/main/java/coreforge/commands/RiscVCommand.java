package coreforge.commands;

import coreforge.typesFormat.TypeCommandFormat;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Registers a command with the decoder by its opcode and instruction format.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface RiscVCommand {
    /**
     * Returns the lookup key for the instruction.
     *
     * @return opcode key with the base opcode in its low seven bits
     */
    int opcode();
    /**
     * Returns the format used to decode the instruction.
     *
     * @return class that extracts the instruction opcode and operands
     */
    Class<? extends TypeCommandFormat> type();
}
