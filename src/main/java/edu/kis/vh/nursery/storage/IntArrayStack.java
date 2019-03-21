package edu.kis.vh.nursery.storage;

public class IntArrayStack implements IntStorageInterface {

    //TODO: NEEDS REFACTORING TO THE BRIDGE PATTERN

    private static final int EMPTY_STACK_HEAD_INDEX = -1;
    private static final int FULL_STACK_HEAD_INDEX = 11;
    private static final int CAPACITY = 12;
    private int[] numbers = new int[CAPACITY];

    private int total = EMPTY_STACK_HEAD_INDEX;

    public static int getEmptyStackHeadIndex() {
        return EMPTY_STACK_HEAD_INDEX;
    }

    public static int getFullStackHeadIndex() {
        return FULL_STACK_HEAD_INDEX;
    }

    public static int getCAPACITY() {
        return CAPACITY;
    }

    public int getTotal() {
        return total;
    }

    @Override
    public void push(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    @Override
    public boolean isEmpty() {
        return total == EMPTY_STACK_HEAD_INDEX;
    }

    @Override
    public boolean isFull() {
        return total == FULL_STACK_HEAD_INDEX;
    }

    public int top() {
        if (isEmpty())
            return EMPTY_STACK_HEAD_INDEX;
        return numbers[total];
    }

    public int pop() {
        if (isEmpty())
            return EMPTY_STACK_HEAD_INDEX;
        return numbers[total--];
    }

    public int[] getNumbers() {
        return numbers;
    }

}
