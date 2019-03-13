package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int STARTING_INT = -1;
    public static final int MAX_TAB_SIZE = 12;
    public static final int FULL_INT = 11;
    private int[] numbers = new int[MAX_TAB_SIZE];

    public int total = STARTING_INT;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == STARTING_INT;
    }

    public boolean isFull() {
        return total == FULL_INT;
    }

    protected int peekaboo() {
        if (callCheck())
            return STARTING_INT;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return STARTING_INT;
        return numbers[total--];
    }
}
