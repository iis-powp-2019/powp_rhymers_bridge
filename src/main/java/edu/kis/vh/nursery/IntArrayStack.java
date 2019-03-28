package edu.kis.vh.nursery;

public class IntArrayStack {

    private static final int TOTAL_VALUE = -1;

    private static final int MAX_SIZE = 12;

    private final int[] numbers = new int[MAX_SIZE];

    private int total = TOTAL_VALUE;

    public int getTotal() {
        return total;
    }

    protected void countIn(final int in) {
        if (!isFull()) {
            numbers[++total] = in;
        }
    }

    protected boolean callCheck() {
        return total == TOTAL_VALUE;
    }

    protected boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck()) {
            return TOTAL_VALUE;
        }
        return numbers[total];
    }

    protected int countOut() {
        if (callCheck()) {
            return TOTAL_VALUE;
        }
        return numbers[total--];
    }
}
