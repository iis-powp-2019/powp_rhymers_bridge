package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private final int MIN = -1;

    private final int MAX = 11;

    private final int AMOUNT_OF_ELEMENTS = 12;

    private int[] numbers = new int[AMOUNT_OF_ELEMENTS];

    private int total = -1;

    public int getTotal() {
        return total;
    }

    public void countIn(final int in) {
        if (!isFull())
            numbers[++total] = in;
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
