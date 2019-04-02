package edu.kis.vh.nursery.stacks;

import edu.kis.vh.nursery.Stack;

public class IntArrayStack implements Stack {

    private int[] numbers = new int[StackValues.STACK_CAPACITY.getValue()];
    private int total = StackValues.EMPTY_STACK_VALUE.getValue();

    @Override
    public void countIn(int in) {
        if (!isFull()) {
            numbers[++total] = in;
        }
    }

    @Override
    public boolean callCheck() {
        return total == StackValues.EMPTY_STACK_VALUE.getValue();
    }

    @Override
    public boolean isFull() {
        return total == StackValues.STACK_CAPACITY.getValue() - 1;
    }

    @Override
    public int actualNumber() {
        if (callCheck()) {
            return StackValues.EMPTY_STACK_VALUE.getValue();
        }

        return numbers[total];
    }

    @Override
    public int countOut() {
        if (callCheck()) {
            return StackValues.EMPTY_STACK_VALUE.getValue();
        }
        return numbers[total--];
    }

    public int[] getNumbers() {
        return numbers;
    }
}
