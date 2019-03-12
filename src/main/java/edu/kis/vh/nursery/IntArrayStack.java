package edu.kis.vh.nursery;

public class IntArrayStack {
    private static final int EMPTY = -1;
    private static final int CAPACITY = 12;
    private int[] numbers = new int[CAPACITY];


    private int total = EMPTY;


    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == 11;
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

    public int getTotal() {
        return total;
    }
}
