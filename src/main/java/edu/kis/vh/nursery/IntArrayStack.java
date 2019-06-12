package edu.kis.vh.nursery;

public class IntArrayStack {

    private static final int STACK_EMPTY = -1;

    private static final int STACK_CAPACITY = 12;

    private final int[] numbers = new int[STACK_CAPACITY];

    public int total = STACK_EMPTY;

    public void countIn(final int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public int getTotal() {
        return total;
    }

    boolean callCheck() {
        return total == STACK_EMPTY;
    }

    boolean isFull() {
        return total == STACK_CAPACITY - 1;
    }

    int peekaboo() {
        if (callCheck())
            return STACK_EMPTY;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return STACK_EMPTY;
        return numbers[total--];
    }
}