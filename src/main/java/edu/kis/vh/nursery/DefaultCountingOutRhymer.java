package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int EMPTY_INDEX = -1;
    private static final int STACK_MAX = 12;
    private int[] numbers = new int[STACK_MAX];

    private int total = EMPTY_INDEX;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    boolean callCheck() {
        return total == EMPTY_INDEX;
    }

    boolean isFull() {
        return total == (STACK_MAX - 1);
    }

    int peekaboo() {
        if (callCheck())
            return EMPTY_INDEX;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_INDEX;
        return numbers[total--];
    }

}
