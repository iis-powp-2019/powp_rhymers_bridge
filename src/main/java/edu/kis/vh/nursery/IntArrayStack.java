package edu.kis.vh.nursery.list;

public class IntArrayStack implements StackListinterface {
    /**
     * Komentarz przykladowy
     */
    //static final int EMPTY = -1;
    static final int MAX_SIZE = 11;
    public static final int STACK_CAPACITY = 12;
    int[] numbers = new int[STACK_CAPACITY];
    public int total = -1;

    public IntArrayStack() {
    }

    public int getTotal() {
        return total;
    }

    public void push(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean isEmpty() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == MAX_SIZE;
    }

    protected int top() {
        if (isEmpty())
            return EMPTY;
        return numbers[total];
    }

    public int pop() {
        if (isEmpty())
            return -1;
        return numbers[total--];
    }
}