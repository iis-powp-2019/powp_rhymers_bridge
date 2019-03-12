package edu.kis.vh.nursery;

public class IntArrayStack {
    static final int STACK_CAPACITY = 12;
    static final int EMPTY = -1;
    static final int MAX_SIZE = 11;
    int[] NUMBERS = new int[STACK_CAPACITY];
    int total = -1;

    public IntArrayStack() {
    }

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == MAX_SIZE;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY;
        return NUMBERS[total--];
    }
}