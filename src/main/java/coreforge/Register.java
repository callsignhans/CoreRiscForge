package coreforge;

public interface Register extends Comparable<Register> {
    Register add(Register other);        // Сложение (+)
    Register subtract(Register other);   // Вычитание (-)
    Register multiply(Register other);   // Умножение (*)
    Register divide(Register other);     // Деление (/)
    Register modulus(Register other);    // Остаток от деления (%)
    Register negate();            // Смена знака (унарный минус)
    Register and(Register other);    // Побитовое И (&)
    Register or(Register other);     // Побитовое ИЛИ (|)
    Register xor(Register other);    // Исключающее ИЛИ (^)
    Register not();           // Побитовое НЕ (~)
    Register shiftLeft(int places);             // Сдвиг влево (<<)
    Register shiftRight(int places);            // Знаковый сдвиг вправо (>>)
    Register shiftRightUnsigned(int places);    // Беззнаковый сдвиг вправо (>>>)

    default boolean isGreaterRegisterhan(Register other) {
        return this.compareTo(other) > 0;
    }

    default boolean isLessRegisterhan(Register other) {
        return this.compareTo(other) < 0;
    }

    default boolean isGreaterRegisterhanOrEqual(Register other) {
        return this.compareTo(other) >= 0;
    }

    default boolean isLessRegisterhanOrEqual(Register other) {
        return this.compareTo(other) <= 0;
    }

    default boolean isEqualRegistero(Register other) {
        return this.compareTo(other) == 0;
    }
}
