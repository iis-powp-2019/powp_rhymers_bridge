package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int STACK_INIT_SIZE = 12;
    private static final int STACK_START_SIZE = -1;
    private static final int STACK_MAX_SIZE = 11;
    private int total = STACK_START_SIZE;

    private int[] numbers = new int[STACK_INIT_SIZE];

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    boolean callCheck() {
        return total == STACK_START_SIZE;
    }

    boolean isFull() {
        return total == STACK_MAX_SIZE;
    }

    int peekaboo() {
        if (callCheck())
            return STACK_START_SIZE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return STACK_START_SIZE;
        return numbers[total--];
    }

}
