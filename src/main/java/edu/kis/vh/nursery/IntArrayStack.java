package edu.kis.vh.nursery;

public class IntArrayStack
{
    final int STACK_MAX_SIZE = 12;
    final int EMPTY_STACK_INDEX = -1;
    private int[] NUMBERS = new int[STACK_MAX_SIZE];
    private int total = EMPTY_STACK_INDEX;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_STACK_INDEX;
    }

    public boolean isFull() {
        return total == STACK_MAX_SIZE - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY_STACK_INDEX;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_STACK_INDEX;
        return NUMBERS[total--];
    }
}
