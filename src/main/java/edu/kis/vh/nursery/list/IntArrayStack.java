package edu.kis.vh.nursery.list;

import edu.kis.vh.nursery.Stackable;

public class IntArrayStack implements Stackable {

    private final int SIZE_NUMBER_ARRAY = 12;
    private final int STACK_EMPTY_SIZE = -1;
    private final int STACK_MAX_SIZE = 11;

    private int[] numbers = new int[SIZE_NUMBER_ARRAY];
    private int total = -1;

    @Override public void push(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    @Override public boolean isEmpty() {
        return total == STACK_EMPTY_SIZE;
    }

    @Override public boolean isFull() {
        return total == STACK_MAX_SIZE;
    }

    @Override public int top() {
        if (isEmpty())
            return STACK_EMPTY_SIZE;
        return numbers[total];
    }

    @Override public int pop() {
        if (isEmpty())
            return STACK_EMPTY_SIZE;
        return numbers[total--];
    }
    //TODO: nalezy usunac nieuzywana metode
    public int getTotal() {
        return total;
    }
}
