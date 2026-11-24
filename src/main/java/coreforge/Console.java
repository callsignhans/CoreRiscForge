package coreforge;

import coreforge.KernelDebug.DumpWidth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Locale;

/**
 * Runs a text debugger that displays register values and memory cells.
 */
public final class Console {
    private final KernelDebug kernel;
    private final BufferedReader input;
    private final Writer output;

    /**
     * Creates a debugger console.
     *
     * @param kernel source of register and memory values
     * @param input reader for command lines
     * @param output writer for command results
     */
    public Console(KernelDebug kernel, Reader input, Writer output) {
        this.kernel = kernel;
        this.input = new BufferedReader(input);
        this.output = output;
    }

    /**
     * Reads and executes commands until input ends or the user enters {@code quit}.
     *
     * @throws IOException if reading input or writing output fails
     */
    public void run() throws IOException {
        String line;
        while ((line = input.readLine()) != null) {
            if (!execute(line)) {
                return;
            }
        }
    }

    /**
     * Executes a single debugger command and reports invalid input to the output writer.
     *
     * @param line command line to process
     * @return {@code false} for a valid quit command and {@code true} otherwise
     * @throws IOException if writing or flushing output fails
     */
    public boolean execute(String line) throws IOException {
        String command = line.strip();
        if (command.isEmpty()) {
            return true;
        }

        String[] words = command.split("\\s+");
        try {
            switch (words[0].toLowerCase(Locale.ROOT)) {
                case "state", "regs" -> {
                    requireWordCount(words, 1, words[0]);
                    for (var register : kernel.dumpRegisters()) {
                        writeLine("x" + register.index() + " = 0x" + Long.toHexString(register.value()));
                    }
                }
                case "dump" -> dumpMemory(words);
                case "help" -> {
                    requireWordCount(words, 1, "help");
                    writeLine("state | regs | dump ram <address> <count> <byte|short|int|long> | help | quit");
                }
                case "quit" -> {
                    requireWordCount(words, 1, "quit");
                    return false;
                }
                default -> writeLine("Unknown command. Type help.");
            }
        } catch (IllegalArgumentException error) {
            writeLine("Error: " + error.getMessage());
        }
        output.flush();
        return true;
    }

    /**
     * Parses a memory dump command and prints its cells in hexadecimal.
     *
     * @param words whitespace-separated command tokens
     * @throws IllegalArgumentException if the dump arguments are invalid
     * @throws IOException if writing a cell fails
     */
    private void dumpMemory(String[] words) throws IOException {
        String usage = "dump ram <address> <count> <byte|short|int|long>";
        requireWordCount(words, 5, usage);
        if (!words[1].equalsIgnoreCase("ram")) {
            throw new IllegalArgumentException("Usage: " + usage);
        }

        long address = parseAddress(words[2]);
        int count = Integer.parseInt(words[3]);
        DumpWidth width;
        try {
            width = DumpWidth.valueOf(words[4].toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException error) {
            throw new IllegalArgumentException("Expected width: byte, short, int or long");
        }

        try (var cells = kernel.dumpMemory(address, count, width)) {
            var iterator = cells.iterator();
            while (iterator.hasNext()) {
                var cell = iterator.next();
                writeLine(hex(cell.address(), 8) + " = " + hex(cell.value(), width.bytes() * 2));
            }
        }
    }

    /**
     * Parses a decimal address or a hexadecimal address with a {@code 0x} prefix.
     *
     * @param text address to parse
     * @return address bits
     * @throws NumberFormatException if the address text is invalid or out of range
     */
    private static long parseAddress(String text) {
        if (text.startsWith("0x") || text.startsWith("0X")) {
            return Long.parseUnsignedLong(text.substring(2), 16);
        }
        return Long.parseLong(text);
    }

    /**
     * Checks the number of tokens in a command.
     *
     * @param words command tokens
     * @param expected required token count
     * @param usage expected command syntax
     * @throws IllegalArgumentException if the token count differs from the required count
     */
    private static void requireWordCount(String[] words, int expected, String usage) {
        if (words.length != expected) {
            throw new IllegalArgumentException("Usage: " + usage);
        }
    }

    /**
     * Formats bits as a hexadecimal value prefixed by {@code 0x}.
     *
     * @param value bits to format
     * @param digits minimum number of hexadecimal digits
     * @return hexadecimal value padded with leading zeros as needed
     */
    private static String hex(long value, int digits) {
        String text = Long.toHexString(value);
        return "0x" + "0".repeat(Math.max(0, digits - text.length())) + text;
    }

    /**
     * Writes text followed by the platform line separator.
     *
     * @param line text to write
     * @throws IOException if writing fails
     */
    private void writeLine(String line) throws IOException {
        output.write(line);
        output.write(System.lineSeparator());
    }
}
