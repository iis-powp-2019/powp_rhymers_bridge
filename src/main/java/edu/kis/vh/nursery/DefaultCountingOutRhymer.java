package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int STACK_CAPACITY = 12;
    private static final int EMPTY_INDEX = -1;
    public static final int FULL_INDEX = 11;
    private int[] numbers = new int[STACK_CAPACITY];

    public int total = EMPTY_INDEX;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_INDEX;
    }

    public boolean isFull() {
        return total == FULL_INDEX;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY_INDEX;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_INDEX;
        return numbers[total--];
    }

}
