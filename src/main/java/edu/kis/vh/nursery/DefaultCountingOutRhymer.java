package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int STACK_MAX_CAPACITY = 12;
    public static final int EMPTY_INDEX_VALUE = -1;

    private int[] stack = new int[STACK_MAX_CAPACITY];
    private int currIndex = EMPTY_INDEX_VALUE;

    public void countIn(int in) {
        if (!isFull())
            stack[++currIndex] = in;
    }

    public boolean callCheck() {
        return currIndex == EMPTY_INDEX_VALUE;
    }

    public boolean isFull() {
        return currIndex == (STACK_MAX_CAPACITY - 1);
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY_INDEX_VALUE;

        return stack[currIndex];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_INDEX_VALUE;

        return stack[currIndex--];
    }

}
