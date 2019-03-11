package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {


    private static final int EMPTY_STACK_HEAD_INDEX = -1;
    private static final int CAPACITY = 12;
    private static final int FULL = 11;
    private int[] numbers = new int[CAPACITY];

    private int total = EMPTY_STACK_HEAD_INDEX;

    protected void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    protected boolean callCheck() {
        return total == EMPTY_STACK_HEAD_INDEX;
    }

    protected boolean isFull() {
        return total == FULL;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY_STACK_HEAD_INDEX;
        return numbers[total];
    }

    protected int countOut() {
        if (callCheck())
            return EMPTY_STACK_HEAD_INDEX;
        return numbers[total--];
    }

}
