package edu.kis.vh.nursery.collections;

public class IntArrayStack implements IntCollection{
    private static final int STACK_LAST_POSITION = 11;
    private static final int STACK_STARTING_POSITION = -1;
    private static final int STACK_VALUE_ON_STARTING_POSITION = -1;
    private int[] numbers = new int[12];

    private int total = STACK_STARTING_POSITION;

    public int getTotal() {
        return total;
    }
    @Override
    public void push(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    @Override
    public boolean isEmpty() {
        return total == STACK_STARTING_POSITION;
    }

    @Override
    public boolean isFull() {
        return total == STACK_LAST_POSITION;
    }

    @Override
    public int top() {
        if (isEmpty())
            return STACK_VALUE_ON_STARTING_POSITION;
        return numbers[total];
    }
    @Override
    public int pop() {
        if (isEmpty())
            return STACK_VALUE_ON_STARTING_POSITION;
        return numbers[total--];
    }

    @Override
    public int getElementCount() {
        return total;
    }

}
