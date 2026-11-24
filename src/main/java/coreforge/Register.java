package coreforge;

/**
 * Defines arithmetic, bitwise, and comparison operations for register values.
 *
 * @param <T> representation returned by {@link #getVal()}
 */
public interface Register<T> extends Comparable<Register<T>> {
    /**
     * Returns the value represented by this register.
     *
     * @return register value
     */
    T getVal();

    /**
     * Adds another register value to this value.
     *
     * @param other right-hand operand
     * @return register holding the sum
     */
    Register<T> add(Register<T> other);        // Сложение (+)

    /**
     * Subtracts another register value from this value.
     *
     * @param other right-hand operand
     * @return register holding the difference
     */
    Register<T> subtract(Register<T> other);   // Вычитание (-)

    /**
     * Multiplies this value by another register value.
     *
     * @param other right-hand operand
     * @return register holding the product
     */
    Register<T> multiply(Register<T> other);   // Умножение (*)

    /**
     * Divides this value by another register value.
     *
     * @param other right-hand operand
     * @return register holding the quotient
     */
    Register<T> divide(Register<T> other);     // Деление (/)

    /**
     * Divides this value by another register value and takes the remainder.
     *
     * @param other right-hand operand
     * @return register holding the remainder
     */
    Register<T> modulus(Register<T> other);    // Остаток от деления (%)

    /**
     * Reverses the arithmetic sign of this value.
     *
     * @return register holding the negated value
     */
    Register<T> negate();            // Смена знака (унарный минус)

    /**
     * Applies bitwise AND to both register values.
     *
     * @param other right-hand operand
     * @return register holding the bitwise intersection
     */
    Register<T> and(Register<T> other);    // Побитовое И (&)

    /**
     * Applies bitwise OR to both register values.
     *
     * @param other right-hand operand
     * @return register holding the bitwise union
     */
    Register<T> or(Register<T> other);     // Побитовое ИЛИ (|)

    /**
     * Applies bitwise XOR to both register values.
     *
     * @param other right-hand operand
     * @return register holding the bitwise exclusive OR
     */
    Register<T> xor(Register<T> other);    // Исключающее ИЛИ (^)

    /**
     * Inverts each bit in this value.
     *
     * @return register holding the bitwise complement
     */
    Register<T> not();           // Побитовое НЕ (~)

    /**
     * Shifts this value left and fills the low bits with zeros.
     *
     * @param places number of bit positions to shift
     * @return register holding the shifted value
     */
    Register<T> shiftLeft(int places);             // Сдвиг влево (<<)

    /**
     * Shifts this value right and extends the sign bit.
     *
     * @param places number of bit positions to shift
     * @return register holding the shifted value
     */
    Register<T> shiftRight(int places);            // Знаковый сдвиг вправо (>>)

    /**
     * Shifts this value right and fills the high bits with zeros.
     *
     * @param places number of bit positions to shift
     * @return register holding the shifted value
     */
    Register<T> shiftRightUnsigned(int places);    // Беззнаковый сдвиг вправо (>>>)

    /**
     * Tests whether this value is greater than another register value.
     *
     * @param other register to compare with
     * @return {@code true} if this value is greater than the other value
     */
    default boolean isGreaterRegisterhan(Register<T> other) {
        return this.compareTo(other) > 0;
    }

    /**
     * Tests whether this value is less than another register value.
     *
     * @param other register to compare with
     * @return {@code true} if this value is less than the other value
     */
    default boolean isLessRegisterhan(Register<T> other) {
        return this.compareTo(other) < 0;
    }

    /**
     * Tests whether this value is greater than or equal to another register value.
     *
     * @param other register to compare with
     * @return {@code true} if this value is greater than or equal to the other value
     */
    default boolean isGreaterRegisterhanOrEqual(Register<T> other) {
        return this.compareTo(other) >= 0;
    }

    /**
     * Tests whether this value is less than or equal to another register value.
     *
     * @param other register to compare with
     * @return {@code true} if this value is less than or equal to the other value
     */
    default boolean isLessRegisterhanOrEqual(Register<T> other) {
        return this.compareTo(other) <= 0;
    }

    /**
     * Tests whether this value is equal to another register value.
     *
     * @param other register to compare with
     * @return {@code true} if this value is equal to the other value
     */
    default boolean isEqualRegistero(Register<T> other) {
        return this.compareTo(other) == 0;
    }
}
