package edu.kis.vh.nursery.ownStackImplementations;

import edu.kis.vh.nursery.IIntStack;

public class IntArrayStack implements IIntStack {

    private static final int STACK_MAX_SIZE = 12;
    private int totalQueueNumbersCount = EMPTY_RETURN_CODE;
    private int[] queueNumbers = new int[STACK_MAX_SIZE];

    @Override
    public void push(int in) {
        if (!isFull())
            queueNumbers[++totalQueueNumbersCount] = in;
    }

    @Override
    public boolean isFull() {
        return totalQueueNumbersCount == (STACK_MAX_SIZE - 1);
    }

    @Override
    public int pop() {
        if (isFull())
            return EMPTY_RETURN_CODE + 1;
        return queueNumbers[totalQueueNumbersCount--];
    }

    @Override
    public int peek() {
        if (isFull())
            return EMPTY_RETURN_CODE + 1;
        return queueNumbers[totalQueueNumbersCount];
    }
}
