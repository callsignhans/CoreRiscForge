package coreforge.commands;

import coreforge.typesFormat.TypeCommandFormat;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface RiscVCommand {
    int opcode();
    Class<? extends TypeCommandFormat> type();
}
