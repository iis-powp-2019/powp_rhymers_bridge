package edu.kis.vh.nursery.stack;

import edu.kis.vh.nursery.Stackable;

public class IntArrayStack implements Stackable {

    private static final int MAX_STACK_SIZE = 12;
    private static final int EMPTY_STACK_VALUE = -1;

    private int[] numbers = new int[MAX_STACK_SIZE];

    private int total = EMPTY_STACK_VALUE;

    @Override
    public void push(final int input) {
        if (!isFull())
            numbers[++total] = input;
    }

    @Override
    public boolean isEmpty() {
        return total == EMPTY_STACK_VALUE;
    }

    @Override
    public boolean isFull() {
        return total == MAX_STACK_SIZE - 1;
    }

    @Override
    public int top() {
        if (isEmpty())
            return EMPTY_STACK_VALUE;
        return numbers[total];
    }

    @Override
    public int pop() {
        if (isEmpty())
            return EMPTY_STACK_VALUE;
        return numbers[total--];
    }

    @Override
    public int getTotal() {
        return total;
    }
}
