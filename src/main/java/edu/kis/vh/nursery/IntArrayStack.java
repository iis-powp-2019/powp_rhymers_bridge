package edu.kis.vh.nursery;

public class IntArrayStack implements StackInterface {

    private static final int EMPTY_STACK_HEAD_INDEX = -1;
    private static final int CAPACITY = 12;
    private static final int FULL = 11;
    private int[] numbers = new int[CAPACITY];

    private int total = EMPTY_STACK_HEAD_INDEX;

    @Override
    public void push(int i) {
        if (!isFull())
            numbers[++total] = i;
    }

    @Override
    public boolean isEmpty() {
        return total == EMPTY_STACK_HEAD_INDEX;
    }


    @Override
    public int top() {
        if (isEmpty())
            return EMPTY_STACK_HEAD_INDEX;
        return numbers[total];
    }

    @Override
    public int pop() {
        if (isEmpty())
            return EMPTY_STACK_HEAD_INDEX;
        return numbers[total--];
    }

    @Override
    public int getHead() {
        return total;
    }

    public boolean isFull() {
        return total == FULL;
    }

}
