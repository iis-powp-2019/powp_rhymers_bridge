package edu.kis.vh.nursery;

public class StackArray implements IntArrayStack {

    private static final int STACK_MAX_SIZE = 12;
    private static final int STACK_START_SIZE = -1;
    private int totalQueueNumbersCount = STACK_START_SIZE;

    private int[] queueNumbers = new int[STACK_MAX_SIZE];

    @Override
    public void countIn(int in) {
        if (!isFull())
            queueNumbers[++totalQueueNumbersCount] = in;
    }

    @Override
    public boolean callCheck() {
        return totalQueueNumbersCount == -1;
    }

    @Override
    public boolean isFull() {
        return totalQueueNumbersCount == (STACK_MAX_SIZE - 1);
    }

    @Override
    public int countOut() {
        if (callCheck())
            return STACK_START_SIZE;
        return queueNumbers[totalQueueNumbersCount--];
    }

    @Override
    public int peekaboo() {
        if (callCheck())
            return STACK_START_SIZE;
        return queueNumbers[totalQueueNumbersCount];
    }
}
