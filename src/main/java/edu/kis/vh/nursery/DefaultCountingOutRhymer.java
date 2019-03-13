package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int DEFAULT = -1;
    public static final int MAX_NUMBER_OF_ELEMENTS = 12;

    private int[] numbers = new int[MAX_NUMBER_OF_ELEMENTS];

    private int total = DEFAULT;

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == DEFAULT;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck()) {
            return DEFAULT;
        }
        return numbers[getTotal()];
    }

    public int countOut() {
        if (callCheck()) {
            return DEFAULT;
        }
        return numbers[total--];
    }

}
