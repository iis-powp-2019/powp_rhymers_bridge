package edu.kis.vh.nursery;

public class StackArray implements IIntStack {

    private static final int STACK_MAX_SIZE = 12;
    private static final int STACK_START_SIZE = -1;
    private int totalQueueNumbersCount = STACK_START_SIZE;

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
            return STACK_START_SIZE;
        return queueNumbers[totalQueueNumbersCount--];
    }

    @Override
    public int peek() {
        if (isFull())
            return STACK_START_SIZE;
        return queueNumbers[totalQueueNumbersCount];
    }
}
