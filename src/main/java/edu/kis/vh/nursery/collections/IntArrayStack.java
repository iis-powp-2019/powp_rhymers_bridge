package edu.kis.vh.nursery.collections;

import edu.kis.vh.nursery.collections.Stack;

public class IntArrayStack implements Stack {
    static final int STACK_CAPACITY = 12;
    static final int MAX_SIZE = 11;
    int[] NUMBERS = new int[STACK_CAPACITY];
    int total = -1;

    public void push(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean isEmpty() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == MAX_SIZE;
    }

    public int top() {
        if (isEmpty())
            return EMPTY;
        return NUMBERS[total];
    }

    public int pop() {
        if (isEmpty())
            return EMPTY;
        return NUMBERS[total--];
    }
}