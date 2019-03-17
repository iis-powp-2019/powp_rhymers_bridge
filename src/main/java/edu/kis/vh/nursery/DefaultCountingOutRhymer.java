package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int STACK_CAPACITY = 12;
    private static final int ERROR_CODE = -1;
    private static final int MAX_SIZE = 11;
    private static final int EMPTY_POSITION = -1;
    private int total = EMPTY_POSITION;
    private int[] NUMBERS = new int[STACK_CAPACITY];


    protected void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    protected boolean callCheck() {
        return total == ERROR_CODE;
    }

    protected boolean isFull() {
        return total == MAX_SIZE;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR_CODE;
        return NUMBERS[total];
    }

    protected int countOut() {
        if (callCheck())
            return ERROR_CODE;
        return NUMBERS[total--];
    }

}
