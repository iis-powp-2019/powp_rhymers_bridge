package edu.kis.vh.nursery.list;

public class IntArrayStack {
    private static final int MAX_CAPACITY = 12;
    private static final int STACK_EMPTY_VALUE = -1;
    private final int[] NUMBERS = new int[MAX_CAPACITY];

    public int getTotal() {
        return total;
    }

    private int total = STACK_EMPTY_VALUE;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    boolean callCheck() {
        return total == STACK_EMPTY_VALUE;
    }

    boolean isFull() {
        return total == MAX_CAPACITY - 1;
    }

    int peekaboo() {
        if (callCheck())
            return STACK_EMPTY_VALUE;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return STACK_EMPTY_VALUE;
        return NUMBERS[total--];
    }
}
