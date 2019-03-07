package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int EMPTY_FIFO = -1;
    public static final int FULL_FIFO = 11;
    public static final int CAPACITY = 12;
    private int[] numbers = new int[CAPACITY];

    public int total = EMPTY_FIFO;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_FIFO;
    }

    public boolean isFull() {
        return total == FULL_FIFO;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY_FIFO;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_FIFO;
        return numbers[total--];
    }

}
