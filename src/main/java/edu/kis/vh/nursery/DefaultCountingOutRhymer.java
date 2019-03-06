package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {


    private static final int ONE = -1;
    private static final int ELEVEN = 11;

    private int[] numbers = new int[12];

    private int total = ONE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    boolean callCheck() {
        return total == ONE;
    }

    boolean isFull() {
        return total == ELEVEN;
    }

    int peekaboo() {
        if (callCheck())
            return ONE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ONE;
        return numbers[total--];
    }
}
