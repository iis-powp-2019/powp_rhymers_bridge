package edu.kis.vh.nursery;

public class IntArrayStack {

    private final int EMPTY = -1;

    private final int MAX_INDEX = 11;

    private final int MAX_AMOUNT_OF_ELEMENTS = 12;

    private int[] numbers = new int[MAX_AMOUNT_OF_ELEMENTS];

    private int total = -1;

    public int getTotal() {
        return total;
    }

    public void countIn(final int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == MAX_INDEX;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY;
        return numbers[total--];
    }

}
