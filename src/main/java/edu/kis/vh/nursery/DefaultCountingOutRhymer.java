package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int MINUS = -1;
    private static final int FULL = 12;
    private int[] numbers = new int[FULL];

    private int total = MINUS;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == MINUS;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return MINUS;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return MINUS;
        return numbers[total--];
    }

}
