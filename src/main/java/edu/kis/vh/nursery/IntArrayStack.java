package edu.kis.vh.nursery;

public class IntArrayStack {
    private static final int STACK_LAST_POSITION = 11;
    private static final int STACK_STARTING_POSITION = -1;
    private static final int STACK_VALUE_ON_STARTING_POSITION = -1;
    private int[] numbers = new int[12];

    private int total = STACK_STARTING_POSITION;

    public int getTotal() {
        return total;
    }

    public void push(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    boolean isEmpty() {
        return total == STACK_STARTING_POSITION;
    }

    boolean isFull() {
        return total == STACK_LAST_POSITION;
    }

    int top() {
        if (isEmpty())
            return STACK_VALUE_ON_STARTING_POSITION;
        return numbers[total];
    }

    public int pop() {
        if (isEmpty())
            return STACK_VALUE_ON_STARTING_POSITION;
        return numbers[total--];
    }

}
