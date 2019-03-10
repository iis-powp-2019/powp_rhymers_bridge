package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private final int STACK_MAX_SIZE = 12;
    private final int INITIAL_STACK_INDEX=-1;
    private int[] NUMBERS = new int[STACK_MAX_SIZE];
    private int total = INITIAL_STACK_INDEX;

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    boolean callCheck() {
        return total == INITIAL_STACK_INDEX;
    }

    boolean isFull() {
        return total == STACK_MAX_SIZE-1;
    }

    int peekaboo() {
        if (callCheck())
            return INITIAL_STACK_INDEX;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return INITIAL_STACK_INDEX;
        return NUMBERS[total--];
    }

}
