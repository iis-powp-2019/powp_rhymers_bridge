package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int STACK_MAX_SIZE = 12;
    public static final int NEGATIVE_NUMBER = -1;
    public static final int FULL_INDEX = 11;
    public static final int INDEX_EMPTY = -1;
    private int[] numbers = new int[STACK_MAX_SIZE];

    public int total = INDEX_EMPTY;

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
            return -1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
