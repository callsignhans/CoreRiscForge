package coreforge;

public interface Register<T> extends Comparable<Register<T>> {
    T getVal();
    Register<T> add(Register<T> other);        // Сложение (+)
    Register<T> subtract(Register<T> other);   // Вычитание (-)
    Register<T> multiply(Register<T> other);   // Умножение (*)
    Register<T> divide(Register<T> other);     // Деление (/)
    Register<T> modulus(Register<T> other);    // Остаток от деления (%)
    Register<T> negate();            // Смена знака (унарный минус)
    Register<T> and(Register<T> other);    // Побитовое И (&)
    Register<T> or(Register<T> other);     // Побитовое ИЛИ (|)
    Register<T> xor(Register<T> other);    // Исключающее ИЛИ (^)
    Register<T> not();           // Побитовое НЕ (~)
    Register<T> shiftLeft(int places);             // Сдвиг влево (<<)
    Register<T> shiftRight(int places);            // Знаковый сдвиг вправо (>>)
    Register<T> shiftRightUnsigned(int places);    // Беззнаковый сдвиг вправо (>>>)

    default boolean isGreaterRegisterhan(Register<T> other) {
        return this.compareTo(other) > 0;
    }

    default boolean isLessRegisterhan(Register<T> other) {
        return this.compareTo(other) < 0;
    }

    default boolean isGreaterRegisterhanOrEqual(Register<T> other) {
        return this.compareTo(other) >= 0;
    }

    default boolean isLessRegisterhanOrEqual(Register<T> other) {
        return this.compareTo(other) <= 0;
    }

    default boolean isEqualRegistero(Register<T> other) {
        return this.compareTo(other) == 0;
    }
}
