package edu.kis.vh.nursery.list;

import edu.kis.vh.nursery.list.StackableInterface;

public class IntArrayStack implements StackableInterface {

    private static final int DEFAULT_INDEX_STACK = -1;
    private static final int NOT_FOUND_RETURN = -1;
    private static final int MAX_SIZE_STACK = 12;

    private final int[] numbers = new int[getMaxSizeStack()];

    private int total = getDefaultIndexStack();

    public static int getDefaultIndexStack() {
        return DEFAULT_INDEX_STACK;
    }

    public static int getNotFoundReturn() {
        return NOT_FOUND_RETURN;
    }

    public static int getMaxSizeStack() {
        return MAX_SIZE_STACK;
    }

    @Override
    public void push(int in) {
        if (!isFull())
            getNumbers()[++total] = in;
    }

    @Override
    public boolean isEmpty() {
        return total == getDefaultIndexStack();
    }

    @Override
    public boolean isFull() {
        return total == getMaxSizeStack() -1;
    }

    public int top() {
        if (isEmpty())
            return getNotFoundReturn();

        return getNumbers()[total];
    }

    public int pop() {
        if (isEmpty())
            return getNotFoundReturn();

        return getNumbers()[total--];
    }

    public int[] getNumbers() {
        return numbers;
    }

}
