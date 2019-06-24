package edu.kis.vh.nursery.stackModules;

public class IntArrayStack implements Data {
    private static final int EMPTY = -1;
    private static final int CAPACITY = 12;
    private int[] numbers = new int[CAPACITY];


    private int total = EMPTY;

    @Override
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    @Override
    public boolean callCheck() {
        return total == EMPTY;
    }

    @Override
    public boolean isFull() {
        return total == 11;
    }

    @Override
    public int peekaboo() {
        if (callCheck())
            return EMPTY;
        return numbers[total];
    }

    @Override
    public int countOut() {
        if (callCheck())
            return EMPTY;
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }
}
