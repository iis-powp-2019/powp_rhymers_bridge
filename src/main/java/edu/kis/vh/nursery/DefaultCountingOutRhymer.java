package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int STACK_EMPTY_INDEX = -1;

    private static final int STACK_MAX_SIZE = 12;

    private int[] numbers = new int[STACK_MAX_SIZE];

    private int total = -1;

    public void countIn(int in) {
        if (!isFull()) {
            numbers[++total] = in;
        }
    }

    public boolean callCheck() {
        return total == STACK_EMPTY_INDEX;
    }

    public boolean isFull() {
        return total == STACK_MAX_SIZE - 1;
    }

    protected int peekaboo() {
        if (callCheck()) {
            return -1;
        }
        return numbers[total];
    }

    public int countOut() {
        if (callCheck()) {
            return -1;
        }
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }

}
