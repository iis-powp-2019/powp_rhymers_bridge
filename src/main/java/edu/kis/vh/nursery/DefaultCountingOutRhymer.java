package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int MAX_STACK_SIZE = 12;
    public static final int EMPTY_STACK_VALUE = -1;

    private int[] numbers = new int[MAX_STACK_SIZE];

    public int total = EMPTY_STACK_VALUE;

    public void countIn(int input) {
        if (!isFull())
            numbers[++total] = input;
    }

    public boolean callCheck() {
        return total == EMPTY_STACK_VALUE;
    }

    public boolean isFull() {
        return total == MAX_STACK_SIZE - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY_STACK_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_STACK_VALUE;
        return numbers[total--];
    }

}
