package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int STACK_CAPACITY = 12;
    public static final int ERROR_CODE = -1;
    public static final int MAX_SIZE = 11;
    public static final int EMPTY_POSITION = -1;

    private int[] NUMBERS = new int[STACK_CAPACITY];
    public int total = EMPTY_POSITION;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == ERROR_CODE;
    }

    public boolean isFull() {
        return total == MAX_SIZE;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR_CODE;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR_CODE;
        return NUMBERS[total--];
    }

}
