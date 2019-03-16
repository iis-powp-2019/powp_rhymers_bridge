package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int CAPACITY = 12;
    public static final int STACK_EMPTY_VALUE = -1;
    public static final int STACK_FULL_VALUE = 11;

    private int[] NUMBERS = new int[CAPACITY];

    public int STACK_EMPTY_INDICATOR = STACK_EMPTY_VALUE; //total wskazuje ostatni element

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
