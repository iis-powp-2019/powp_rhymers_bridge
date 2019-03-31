package edu.kis.vh.nursery.list;

public class IntArrayStack implements Stackable {
    private static final int MAX_CAPACITY = 12;
    private static final int STACK_EMPTY_VALUE = -1;
    private final int[] NUMBERS = new int[MAX_CAPACITY];

    public int getTotal() {
        return total;
    }

    private int total = STACK_EMPTY_VALUE;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == STACK_EMPTY_VALUE;
    }

    @Override
    public int top() {
        if (isEmpty())
            return STACK_EMPTY_VALUE;
        return NUMBERS[total];
    }

    @Override
    public void push(int i) {
        if (!isFull())
            NUMBERS[++total] = i;
    }

    @Override
    public int pop() {
        if (isEmpty())
            return STACK_EMPTY_VALUE;
        return NUMBERS[total--];
    }

    @Override
    public boolean isEmpty() {
        return total == STACK_EMPTY_VALUE;
    }

    @Override
    public boolean isFull() {
        return total == MAX_CAPACITY - 1;
    }

    public int peekaboo() {
        if (callCheck())
            return STACK_EMPTY_VALUE;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return STACK_EMPTY_VALUE;
        return NUMBERS[total--];
    }
}
