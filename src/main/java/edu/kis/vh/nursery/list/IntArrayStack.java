package edu.kis.vh.nursery.list;

import edu.kis.vh.nursery.Stack;

public class IntArrayStack implements Stack {

    private static final int STACK_CAPACITY = 12;
    private static final int EMPTY_STACK_VALUE = -1;

    private int[] numbers = new int[STACK_CAPACITY];
    private int total = EMPTY_STACK_VALUE;

    @Override
    public void countIn(int in) {
        if (!isFull()) {
            numbers[++total] = in;
        }
    }

    @Override
    public boolean callCheck() {
        return total == EMPTY_STACK_VALUE;
    }

    @Override
    public boolean isFull() {
        return total == STACK_CAPACITY - 1;
    }

    @Override
    public int actualNumber() {
        if (callCheck()) {
            return EMPTY_STACK_VALUE;
        }

        return numbers[total];
    }

    @Override
    public int countOut() {
        if (callCheck()) {
            return EMPTY_STACK_VALUE;
        }
        return numbers[total--];
    }

    public int[] getNumbers() {
        return numbers;
    }
}
