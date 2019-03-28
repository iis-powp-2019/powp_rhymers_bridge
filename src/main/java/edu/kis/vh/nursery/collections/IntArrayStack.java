package edu.kis.vh.nursery.collections;

public class IntArrayStack implements Collections {

    private final int CAPACITY = 12;
    private int[] arrayOfRhymers = new int[CAPACITY];
    private int currentSize = 0;

    public int getCurrentSize() {
        return currentSize;
    }

    public void push(int in) {
        if (!isFull())
            arrayOfRhymers[++currentSize] = in;
    }

    public boolean isEmpty() {
        return currentSize == EMPTY_VALUE;
    }

    public boolean isFull() {
        return currentSize == 11;
    }

    public int top() {
        if (isEmpty())
            return EMPTY_VALUE;
        return arrayOfRhymers[currentSize];
    }

    public int pop() {
        if (isEmpty())
            return -1;
        return arrayOfRhymers[currentSize--];
    }

}
