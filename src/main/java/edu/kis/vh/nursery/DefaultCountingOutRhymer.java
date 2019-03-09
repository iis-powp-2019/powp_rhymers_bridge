package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int STACK_MAX_SIZE = 12;
    private static final int NEGATIVE_NUMBER = -1;
    private static final int FULL_INDEX = 11;
    private static final int INDEX_EMPTY = -1;
    public static final int NAMBER_OUT = -1;
    public static final int NAMBER_PIKABO = -1;
    private int[] numbers = new int[STACK_MAX_SIZE];

    private int total = INDEX_EMPTY;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == NEGATIVE_NUMBER;
    }

    public boolean isFull() {
        return total == FULL_INDEX;
    }

    protected int peekaboo() {
        if (callCheck())
            return NAMBER_PIKABO;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return NAMBER_OUT;
        return numbers[total--];
    }

}
