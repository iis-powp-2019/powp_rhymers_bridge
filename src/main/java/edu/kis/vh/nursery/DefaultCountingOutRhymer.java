package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int STACK_VALUE = -1;
    private static final int STACK_MAX_SIZE = 12;
    private int[] NUMBERS = new int[STACK_MAX_SIZE];

    public int getTotal() {
        return total;
    }

    private int total = STACK_VALUE;

    protected void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    protected boolean callCheck() {
        return total == STACK_VALUE;
    }


    protected boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return STACK_VALUE;
        return NUMBERS[total];
    }

    protected int countOut() {
        if (callCheck())
            return STACK_VALUE;
        return NUMBERS[total--];
    }

}
