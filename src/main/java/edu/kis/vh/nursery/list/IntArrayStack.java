package edu.kis.vh.nursery.list;

public class IntArrayStack {

    private static final int EMPTY_FIFO = -1;
    private static final int FULL_FIFO = 11;
    private static final int CAPACITY = 12;
    private int[] numbers = new int[CAPACITY];

    private int total = EMPTY_FIFO;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    boolean callCheck() {
        return total == EMPTY_FIFO;
    }

    boolean isFull() {
        return total == FULL_FIFO;
    }

    int peekaboo() {
        if (callCheck())
            return EMPTY_FIFO;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_FIFO;
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }
}
