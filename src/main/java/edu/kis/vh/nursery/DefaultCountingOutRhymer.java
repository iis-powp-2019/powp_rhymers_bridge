package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private final int SIZE_NUMBER_ARRAY = 12;
    private final int STACK_EMPTY_SIZE = -1;
    private final int STACK_MAX_SIZE = 11;

    private int[] NUMBERS = new int[SIZE_NUMBER_ARRAY];
    private int total = -1;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    boolean callCheck() {
        return total == STACK_EMPTY_SIZE;
    }

    boolean isFull() {
        return total == STACK_MAX_SIZE;
    }

    int peekaboo() {
        if (callCheck())
            return STACK_EMPTY_SIZE;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return STACK_EMPTY_SIZE;
        return NUMBERS[total--];
    }

    public int getTotal() {
        return total;
    }

}
