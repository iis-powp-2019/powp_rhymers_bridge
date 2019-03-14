package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    private int[] NUMBERS = new int[12];
    private int STACK_EMPTY_SIZE = -1;
    private int STACK_MAX_SIZE = 11;

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == STACK_EMPTY_SIZE;
    }

    public boolean isFull() {
        return total == STACK_MAX_SIZE;
    }

    protected int peekaboo() {
        if (callCheck())
            return STACK_EMPTY_SIZE;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return STACK_EMPTY_SIZE;
        return NUMBERS[total--];
    }

}
