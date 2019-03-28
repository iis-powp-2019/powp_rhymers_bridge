package edu.kis.vh.nursery;

public class IntArrayStack {

    private final int CAPACITY = 12;
    private final int EMPTY_VALUE = -1;
    private int[] arrayOfRhymers = new int[CAPACITY];
    private int currentSize = EMPTY_VALUE;

    public int getCurrentSize() {
        return currentSize;
    }

    public void countIn(int in) {
        if (!isFull())
            arrayOfRhymers[++currentSize] = in;
    }

    public boolean callCheck() {
        return currentSize == EMPTY_VALUE;
    }

    public boolean isFull() {
        return currentSize == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY_VALUE;
        return arrayOfRhymers[currentSize];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return arrayOfRhymers[currentSize--];
    }

}
