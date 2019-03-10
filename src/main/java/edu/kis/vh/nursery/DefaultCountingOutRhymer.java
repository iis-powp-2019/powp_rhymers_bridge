package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int EMPTY_STACK_HEAD_INDEX = -1;
    private static final int FULL_STACK_HEAD_INDEX = 11;
    private static final int CAPACITY = 12;
    private int[] numbers = new int[CAPACITY];

    private int total = EMPTY_STACK_HEAD_INDEX;

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_STACK_HEAD_INDEX;
    }

    public boolean isFull() {
        return total == FULL_STACK_HEAD_INDEX;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY_STACK_HEAD_INDEX;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_STACK_HEAD_INDEX;
        return numbers[total--];
    }

}
