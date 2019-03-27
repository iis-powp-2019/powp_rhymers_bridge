package edu.kis.vh.nursery.stackImplementation;

public class IntArrayStack implements Stack {
    private static final int ERROR = -1;
    private static final int MAX_STACK = 12;
    private static final int CAPACITY = 11;
    private int[] numbers = new int[MAX_STACK];

    private int total = ERROR;

    public void push(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean isEmpty() {
        return total == ERROR;
    }

    public boolean isFull() {
        return total == CAPACITY;
    }

    public int top() {
        if (isEmpty())
            return ERROR;
        return numbers[total];
    }

    public int pop() {
        if (isEmpty())
            return ERROR;
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }

}
