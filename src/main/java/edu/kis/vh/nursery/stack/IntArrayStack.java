package edu.kis.vh.nursery.stack;

import edu.kis.vh.nursery.Stackable;

public class IntArrayStack implements Stackable {

    private static final int MAX_STACK_SIZE = 12;
    private int[] numbers = new int[MAX_STACK_SIZE];

    private int total = NO_ANY_ELEMENTS;

    @Override
    public void push(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    @Override
    public boolean isEmpty() {
        return total == NO_ANY_ELEMENTS;
    }

    @Override
    public boolean isFull() {
        return total == MAX_STACK_SIZE - 1;
    }

    @Override
    public int top() {
        if (isEmpty())
            return NO_ANY_ELEMENTS;
        return numbers[total];
    }

    @Override
    public int pop() {
        if (isEmpty())
            return NO_ANY_ELEMENTS;
        return numbers[total--];
    }
}
