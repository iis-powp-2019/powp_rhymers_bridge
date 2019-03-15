package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int STACK_INIT_SIZE = 12;
    public static final int STACK_START_SIZE = -1;
    public static final int STACK_MAX_SIZE = 11;
    public int total = STACK_START_SIZE;

    private int[] numbers = new int[STACK_INIT_SIZE];

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == STACK_START_SIZE;
    }

    public boolean isFull() {
        return total == STACK_MAX_SIZE;
    }

    protected int peekaboo() {
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
