package edu.kis.vh.nursery.containers;

import static edu.kis.vh.nursery.containers.Node.DEFAULT_INDEX;

public class IntArrayStack implements Stack {

    private static final int MAX_STACK_CAPACITY = 12;

    private int[] numbers = new int[MAX_STACK_CAPACITY];

    private int total = DEFAULT_INDEX;

    public int getTotal() {
        return total;
    }


    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean isCheck() {
        return total == DEFAULT_INDEX;
    }

    @Override
    public void push(int i) {
        countIn(i);
    }

    @Override
    public boolean isEmpty() {
        return isCheck();
    }

    public boolean isFull() {
        return total == MAX_STACK_CAPACITY - 1;
    }

    @Override
    public int top() {
        return peekaboo();
    }

    @Override
    public int pop() {
        return countOut();
    }

    protected int peekaboo() {
        if (isCheck())
            return DEFAULT_INDEX;

        return numbers[total];
    }

    public int countOut() {
        if (isCheck())
            return DEFAULT_INDEX;

        return numbers[total--];
    }

}
