package edu.kis.vh.nursery.storage;

public class IntArrayStack implements IntStorageInterface {
    private static final int NUMBERS_SIZE = 12;
    private static final int FULL = 11;
    private int[] numbers = new int[getNumbersSize()];

    private int total = getEMPTY();

    private static int getEMPTY() {
        return EMPTY;
    }

    private static int getNumbersSize() {
        return NUMBERS_SIZE;
    }

    private static int getFULL() {
        return FULL;
    }

    @Override
    public void push(int in) {
        if (!isFull())
            getNumbers()[++total] = in;
    }

    @Override
    public boolean isEmpty() {
        return total == getEMPTY();
    }

    @Override
    public boolean isFull() {
        return total == getFULL();
    }

    @Override
    public int top() {
        if (isEmpty())
            return getEMPTY();
        return getNumbers()[total];
    }

    @Override
    public int pop() {
        if (isEmpty())
            return getEMPTY();
        return getNumbers()[total--];
    }

    public int getTotal() {
        return total;
    }

    private int[] getNumbers() {
        return numbers;
    }
}
