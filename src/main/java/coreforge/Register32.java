package coreforge;

public class Register32 implements Register<Register32> {

    int value;
    Register32(int val) {
        value = val;
    }

    @Override
    public Register32 getVal() {
        return this;
    }

    @Override
    public Register<Register32> add(Register<Register32> other) {
        return new Register32(this.value + other.getVal().value);
    }

    @Override
    public Register<Register32> subtract(Register<Register32> other) {
        return null;
    }

    @Override
    public Register<Register32> multiply(Register<Register32> other) {
        return null;
    }

    @Override
    public Register<Register32> divide(Register<Register32> other) {
        return null;
    }

    @Override
    public Register<Register32> modulus(Register<Register32> other) {
        return null;
    }

    @Override
    public Register<Register32> negate() {
        return null;
    }

    @Override
    public Register<Register32> and(Register<Register32> other) {
        return null;
    }

    @Override
    public Register<Register32> or(Register<Register32> other) {
        return null;
    }

    @Override
    public Register<Register32> xor(Register<Register32> other) {
        return null;
    }

    @Override
    public Register<Register32> not() {
        return null;
    }

    @Override
    public Register<Register32> shiftLeft(int places) {
        return null;
    }

    @Override
    public Register<Register32> shiftRight(int places) {
        return null;
    }

    @Override
    public Register<Register32> shiftRightUnsigned(int places) {
        return null;
    }

    @Override
    public int compareTo(Register<Register32> register32Register) {
        return 0;
    }
}
