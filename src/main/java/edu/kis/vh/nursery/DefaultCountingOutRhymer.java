package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int MAX_VALUE = 11;
    private static final int DEFAULT_INDEX = -1;
    private static final int CAPACITY = 12;

    private int[] NUMBERS = new int[CAPACITY];

    public int total = DEFAULT_INDEX;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == DEFAULT_INDEX;
    }

    public boolean isFull() {
        return total == MAX_VALUE;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_INDEX;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT_INDEX;
        return NUMBERS[total--];
    }
}
