package edu.kis.vh.nursery.list;

public class IntArrayStack implements IIntCounter
{
    final int STACK_MAX_SIZE = 12;
    private int[] NUMBERS = new int[STACK_MAX_SIZE];
    private int total = EMPTY_STACK_INDEX;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public void push(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    @Override
    public boolean isEmpty() {
        return total == EMPTY_STACK_INDEX;
    }

    @Override
    public boolean isFull() {
        return total == STACK_MAX_SIZE - 1;
    }

    @Override
    public int top() {
        if (isEmpty())
            return EMPTY_STACK_INDEX;
        return NUMBERS[total];
    }

    @Override
    public int pop() {
        if (isEmpty())
            return EMPTY_STACK_INDEX;
        return NUMBERS[total--];
    }
}
