package edu.kis.vh.nursery.stack;

import edu.kis.vh.nursery.stack.IntStack;

public class IntArrayStack implements IntStack {

    private static final int STACK_CAPACITY = 12;
    private static final int FULL_INDEX = 11;
    private int[] numbers = new int[STACK_CAPACITY];

    @Override
    public int getTotal() {
        return total;
    }

    private int total = EMPTY_INDEX;

    @Override
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    @Override
    public boolean callCheck() {
        return total == EMPTY_INDEX;
    }

    @Override
    public boolean isFull() {
        return total == FULL_INDEX;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY_INDEX;
        return numbers[total];
    }

    @Override
    public int countOut() {
        if (callCheck())
            return EMPTY_INDEX;
        return numbers[total--];
    }
}
