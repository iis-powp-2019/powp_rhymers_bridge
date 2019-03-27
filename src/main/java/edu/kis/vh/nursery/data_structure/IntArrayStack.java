package edu.kis.vh.nursery.data_structure;

public class IntArrayStack implements DataStructure {

    private final int EMPTY = -1;

    private final int MAX_INDEX = 11;

    private final int MAX_AMOUNT_OF_ELEMENTS = 12;

    private int[] numbers = new int[MAX_AMOUNT_OF_ELEMENTS];

    private int total = -1;

    @Override
    public void push(int i) {
        if (!isFull())
            numbers[++total] = i;
    }

    @Override
    public boolean isEmpty() {
        return total == EMPTY;
    }

    @Override
    public boolean isFull() {
        return total == MAX_INDEX;
    }

    @Override
    public int top() {
        if (isEmpty())
            return EMPTY;
        return numbers[total];
    }

    @Override
    public int pop() {
        if (isEmpty())
            return EMPTY;
        return numbers[total--];
    }

}
