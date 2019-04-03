package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int INITIAL_STACK_INDEX = -1;
    private static final int RETURN_VALUE = -1;
    private static final int FULL_STACK_SIZE = 11;
    private static final int MAX_STACK_SIZE = 12;

    private final int[] numbers = new int[MAX_STACK_SIZE];

    private int total = INITIAL_STACK_INDEX;

    public int getTotal() {
        return total;
    }

    public void countIn(final int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    boolean callCheck() {
        return total == INITIAL_STACK_INDEX;
    }

    boolean isFull() {
        return total == FULL_STACK_SIZE;
    }

    int peekaboo() {
        if (callCheck())
            return RETURN_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return RETURN_VALUE;
        return numbers[total--];
    }
    
}
