package edu.kis.vh.nursery.list;

import edu.kis.vh.nursery.StackInterface;

public class IntArrayStack implements StackInterface {
    private static final int MAXSIZE = 12;
    private static final int DEFAULT_STACK_VALUE = -1;
    private static final int MAX_STACK_VALUE = 11;
    private static final int ERROR_NUMBER = -1;
    private final int[] numbers = new int[MAXSIZE];

    private int total = DEFAULT_STACK_VALUE;

    @Override
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    @Override
    public boolean callCheck() {
        return total == DEFAULT_STACK_VALUE;
    }

    @Override
    public boolean isFull() {
        return total == MAX_STACK_VALUE;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR_NUMBER;
        return numbers[total];
    }

    @Override
    public int countOut() {
        if (callCheck())
            return ERROR_NUMBER;
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }

    public int[] getNumbers() {
        return numbers;
    }
}
