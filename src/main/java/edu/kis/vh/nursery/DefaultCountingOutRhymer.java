package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    private static final int DEFAULT_RETURN_VALUE = -1;
    private static final int MAX_STACK_SIZE = 12;
    private int[] numbers = new int[MAX_STACK_SIZE];

    public int total = DEFAULT_RETURN_VALUE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == DEFAULT_RETURN_VALUE;
    }

    public boolean isFull() {
        return total == MAX_STACK_SIZE-1;
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
