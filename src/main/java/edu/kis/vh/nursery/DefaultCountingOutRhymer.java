package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int STARTING_INT = -1;
    private static final int MAX_TAB_SIZE = 12;
    private static final int FULL_INT = 11;
    private int[] numbers = new int[MAX_TAB_SIZE];

    public int getTotal() {
        return total;
    }

    private int total = STARTING_INT;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    boolean callCheck() {
        return total == STARTING_INT;
    }

    boolean isFull() {
        return total == FULL_INT;
    }

    int peekaboo() {
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
