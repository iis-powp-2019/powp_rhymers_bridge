package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int DEFAULT_RETURN_VALUE = -1;
    public static final int FULL_STACK = 11;
    public static final int MAX_STACK_SIZE = 12;
    private int[] numbers = new int[MAX_STACK_SIZE];
    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == DEFAULT_RETURN_VALUE;
    }

    public boolean isFull() {
        return total == FULL_STACK;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_RETURN_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT_RETURN_VALUE;
        return numbers[total--];
    }
}
