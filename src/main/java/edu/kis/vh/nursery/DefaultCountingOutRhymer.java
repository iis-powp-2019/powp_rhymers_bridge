package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int STACK_CAPACITY = 12;
    public static final int ERROR_CODE = -1;
    public static final int MAX_SIZE = 11;
    public static final int EMPTY_POSITION = -1;

    private int total = getEmptyPosition();
    private int[] NUMBERS = new int[getStackCapacity()];

    public static int getStackCapacity() {
        return STACK_CAPACITY;
    }

    public static int getErrorCode() {
        return ERROR_CODE;
    }

    public static int getMaxSize() {
        return MAX_SIZE;
    }

    public static int getEmptyPosition() {
        return EMPTY_POSITION;
    }
    public int getTotal() {
        return total;
    }


    protected void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    protected boolean callCheck() {
        return total == getErrorCode();
    }

    protected boolean isFull() {
        return total == getMaxSize();
    }

    protected int peekaboo() {
        if (callCheck())
            return getErrorCode();
        return NUMBERS[total];
    }

    protected int countOut() {
        if (callCheck())
            return getErrorCode();
        return NUMBERS[total--];
    }



}
