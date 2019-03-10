package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    final int STACK_MAX_SIZE = 12;
    final int INITIAL_STACK_INDEX=-1;
    private int[] NUMBERS = new int[STACK_MAX_SIZE];

    public int total = INITIAL_STACK_INDEX;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == INITIAL_STACK_INDEX;
    }

    public boolean isFull() {
        return total == STACK_MAX_SIZE-1;
    }

    protected int peekaboo() {
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
