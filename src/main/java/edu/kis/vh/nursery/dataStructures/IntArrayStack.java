package edu.kis.vh.nursery.list;

import edu.kis.vh.nursery.IStackAndListSimilarities;

public class IntArrayStack implements IStackAndListSimilarities {

    private static final int STACK_CAPACITY = 12;
    private static final int MIN_TOTAL_VALUE = -1;
    private int[] numbers = new int[getStackCapacity()];

    public static int getStackCapacity() {
        return STACK_CAPACITY;
    }

    public static int getMinTotalValue() {
        return MIN_TOTAL_VALUE;
    }

    public int getTotal() {
        return total;
    }

    private int total = getMinTotalValue();

    @Override public void countIn(int in) {
        if (!isFull())
            getNumbers()[++total] = in;
    }

    @Override public boolean callCheck() {
        return total == getMinTotalValue();
    }

    @Override public boolean isFull() {
        return total == 11;
    }

    @Override public int peekaboo() {
        if (callCheck())
            return -1;
        return getNumbers()[total];
    }

    @Override public int countOut() {
        if (callCheck())
            return -1;
        return getNumbers()[total--];
    }

    public int[] getNumbers() {
        return numbers;
    }

}
