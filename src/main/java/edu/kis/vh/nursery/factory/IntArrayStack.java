package edu.kis.vh.nursery.factory;

public class IntArrayStack {
    private static final int MIN = -1;
    private static final int MAX = 11;
    private static final int MAX_SIZE_NUMBERS = 12;
    private int[] numbers = new int[MAX_SIZE_NUMBERS];

    private int total = -1;

    public int getTotal() {
        return total;
    }

    public void countIn(final int IN) {
        if (!isFull())
            numbers[++total] = IN;
    }

    public boolean callCheck() {
        return total == MIN;
    }

    public boolean isFull() {
        return total == MAX;
    }

    protected int peekaboo() {
        if (callCheck())
            return MIN;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return MIN;
        return numbers[total--];
    }

}
