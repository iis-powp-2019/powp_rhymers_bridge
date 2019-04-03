package edu.kis.vh.nursery.list;

import edu.kis.vh.nursery.list.Stackable;

public class IntArrayStack implements Stackable {

    private static final int STACK_EMPTY = -1;
    private static final int STACK_FULL = 11;
    private static final int STACK_CAPACITY = 12;
    private int[] NUMBERS = new int[STACK_CAPACITY];

    @Override public int getTotal() {
        return total;
    }

    private int total = STACK_EMPTY;

    @Override public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    @Override public boolean callCheck() {
        return total == STACK_EMPTY;
    }

    @Override public boolean isFull() {
        return total == STACK_FULL;
    }

    @Override public int peekaboo() {
        if (callCheck())
            return STACK_EMPTY;
        return NUMBERS[total];
    }

    @Override public int countOut() {
        if (callCheck())
            return STACK_EMPTY;
        return NUMBERS[total--];
    }

}
