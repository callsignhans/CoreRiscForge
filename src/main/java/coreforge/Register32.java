package coreforge;

public class Register32 implements Register {
    int value;
    Register32(int val) {
        value = val;
    }

    @Override
    public Register add(Register other) {
        if(other instanceof Register32 other32) {
            return new Register32(value + other32.value);
        }
        throw new IllegalArgumentException("not correct argument(replace desc problem)");
    }

    @Override
    public Register subtract(Register other) {
        return null;
    }

    @Override
    public Register multiply(Register other) {
        return null;
    }

    @Override
    public Register divide(Register other) {
        return null;
    }

    @Override
    public Register modulus(Register other) {
        return null;
    }

    @Override
    public Register negate() {
        return null;
    }

    @Override
    public Register and(Register other) {
        return null;
    }

    @Override
    public Register or(Register other) {
        return null;
    }

    @Override
    public Register xor(Register other) {
        return null;
    }

    @Override
    public Register not() {
        return null;
    }

    @Override
    public Register shiftLeft(int places) {
        return null;
    }

    @Override
    public Register shiftRight(int places) {
        return null;
    }

    @Override
    public Register shiftRightUnsigned(int places) {
        return null;
    }

    @Override
    public int compareTo(Register register) {
        return 0;
    }
}
