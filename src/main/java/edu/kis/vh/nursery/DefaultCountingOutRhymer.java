package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int NUMBERS_EMPTY = -1;
    public static final int NUMBERS_EMPTY_VALUE = -1;
    public static final int NUMBERS_MAX_SIZE = 12;
    private int[] numbers = new int[NUMBERS_MAX_SIZE];

    public int total = NUMBERS_EMPTY;

    public void countIn(int in) {

        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == NUMBERS_EMPTY;
    }

    public boolean isFull() {
        return total == NUMBERS_MAX_SIZE-1;
    }

    protected int peekaboo() {

        if (callCheck())
            return NUMBERS_EMPTY_VALUE;
        return numbers[total];
    }

    public int countOut() {

        if (callCheck())
            return NUMBERS_EMPTY_VALUE;
        return numbers[total--];
    }

}
