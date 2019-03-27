package edu.kis.vh.nursery.stack;

public class IntArrayStack implements RhymerStack
{
    private static final int STARTING_INT = -1;
    private static final int MAX_TAB_SIZE = 12;
    private static final int FULL_INT = 11;
    private int[] numbers = new int[MAX_TAB_SIZE];

    public int getTotal() {
        return total;
    }

    private int total = STARTING_INT;

    public void push(final int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean isEmpty() {
        return total == STARTING_INT;
    }

    public boolean isFull() {
        return total == FULL_INT;
    }

    public int top() {
        if (isEmpty())
            return STARTING_INT;
        return numbers[total];
    }

    public int pop() {
        if (isEmpty())
            return STARTING_INT;
        return numbers[total--];
    }
}
