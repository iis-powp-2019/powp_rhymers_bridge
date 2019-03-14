package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int TOTAL_VALUE = -1;

    private static final int MAX_SIZE = 12;

    private int[] numbers = new int[MAX_SIZE];

    public int total = TOTAL_VALUE;

    public void countIn(int in) {
        if (!isFull()) {
            numbers[++total] = in;
        }
    }

    public boolean callCheck() {
        return total == TOTAL_VALUE;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck()) {
            return TOTAL_VALUE;
        }
        return numbers[total];
    }

    public int countOut() {
        if (callCheck()) {
            return TOTAL_VALUE;
        }
        return numbers[total--];
    }

}
