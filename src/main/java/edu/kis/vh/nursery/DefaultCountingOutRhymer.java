package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int CAPACITY = 12;
    private static final int STACK_EMPTY_VALUE = -1;
    private static final int STACK_FULL_VALUE = 11;

    private int[] NUMBERS = new int[CAPACITY];

    private int STACK_EMPTY_INDICATOR = STACK_EMPTY_VALUE; //STACK_EMPTY_INDICATOR wskazuje ostatni element

    public int getSTACK_EMPTY_INDICATOR() {
        return STACK_EMPTY_INDICATOR;
    }

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++STACK_EMPTY_INDICATOR] = in;
    }

    public boolean callCheck() {
        return STACK_EMPTY_INDICATOR == STACK_EMPTY_VALUE;
    }

    public boolean isFull() {
        return STACK_EMPTY_INDICATOR == STACK_FULL_VALUE;
    }

    protected int peekaboo() {
        if (callCheck())
            return STACK_EMPTY_VALUE;
        return NUMBERS[STACK_EMPTY_INDICATOR];
    }

    public int countOut() {
        if (callCheck())
            return STACK_EMPTY_VALUE;
        return NUMBERS[STACK_EMPTY_INDICATOR--];
    }

}
