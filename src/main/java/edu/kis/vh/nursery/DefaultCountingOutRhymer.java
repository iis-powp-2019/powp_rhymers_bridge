package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int MINUS_ONE = -1;
    private static final int ELEVEN = 11;
    private int[] numbers = new int[12];

    public int total = -1;

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == MINUS_ONE;
    }

    public boolean isFull() {
        return total == ELEVEN;
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
