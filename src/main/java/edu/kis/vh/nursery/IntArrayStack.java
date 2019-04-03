package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IIntStack;

public class IntArrayStack implements IIntStack {
    private static final int STACK_CAPACITY = 12;

    private static final int ERROR_CODE = -1;

    private final int[] numbers = new int[STACK_CAPACITY];

    public int getTotal() {
        return total;
    }

    private int total = ERROR_CODE;

    public void push(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean isEmpty() {
        return total == ERROR_CODE;
    }

    public boolean isFull() {
        return total == 11;
    }

    public int top() {
        if (isEmpty())
            return ERROR_CODE;
        return numbers[total];
    }

    public int pop() {
        if (isEmpty())
            return ERROR_CODE;
        return numbers[total--];
    }

}
