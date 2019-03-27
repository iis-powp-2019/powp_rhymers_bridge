package edu.kis.vh.nursery.list;

import edu.kis.vh.nursery.list.Stack;

public class IntArrayStack implements Stack {

    private static final int STACK_CAPACITY = 12;
    private static final int EMPTY_STACK_SIZE = -1;

    private int[] numbers = new int[STACK_CAPACITY];
    private int total = EMPTY_STACK_SIZE;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public void push(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    @Override
    public boolean isEmpty() {
        return total == -1;
    }


    @Override
    public boolean isFull() {
        return total == 11;
    }

    @Override
    public int top() {
        if (isEmpty())
            return -1;
        return numbers[total];
    }

    @Override
    public int pop() {
        if (isEmpty())
            return -1;
        return numbers[total--];
    }
}
