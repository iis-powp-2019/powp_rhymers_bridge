package edu.kis.vh.nursery.storage;

public class IntArrayStack implements Stack {

    private static final int STACK_CAPACITY = 12;

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
        return total == EMPTY_STACK_SIZE;
    }


    @Override
    public boolean isFull() {
        return total == 11;
    }

    @Override
    public int top() {
        if (isEmpty())
            return EMPTY_STACK_SIZE;
        return numbers[total];
    }

    @Override
    public int pop() {
        if (isEmpty())
            return EMPTY_STACK_SIZE;
        return numbers[total--];
    }
}
