package edu.kis.vh.nursery.list;

public class IntArrayStack {

    private static final int EMPTY_INDEX = -1;
    private static final int STACK_MAX = 12;
    private final int[] numbers = new int[STACK_MAX];

    private int total = EMPTY_INDEX;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_INDEX;
    }

    public boolean isFull() {
        return total == (STACK_MAX - 1);
    }

    public int peekaboo() {
        if (callCheck())
            return EMPTY_INDEX;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_INDEX;
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }
}
