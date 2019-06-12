package edu.kis.vh.nursery.list;

import edu.kis.vh.nursery.IStack;

public class IntArrayStack implements IStack {

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

    @Override
    public boolean callCheck() {
        return total == STACK_EMPTY;
    }

    @Override
    public boolean isFull() {
        return total == STACK_CAPACITY - 1;
    }

    @Override
    public int peekaboo() {
        if (callCheck())
            return STACK_EMPTY;
        return numbers[total];
    }

    @Override
    public int countOut() {
        if (callCheck())
            return STACK_EMPTY;
        return numbers[total--];
    }
}