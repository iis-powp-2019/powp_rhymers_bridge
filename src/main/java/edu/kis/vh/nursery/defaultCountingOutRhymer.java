package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int MAXSIZE = 12;
    private static final int DEFAULT_STACK_VALUE = -1;
    private static final int MAX_STACK_VALUE = 11;
    private static final int ERROR_NUMBER = -1;
    private int[] numbers = new int[MAXSIZE];

    private int total = DEFAULT_STACK_VALUE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == DEFAULT_STACK_VALUE;
    }

    public boolean isFull() {
        return total == MAX_STACK_VALUE;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR_NUMBER;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR_NUMBER;
        return numbers[total--];
    }

}
