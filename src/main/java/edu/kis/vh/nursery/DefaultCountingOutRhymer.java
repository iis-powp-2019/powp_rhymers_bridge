package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private final int CAPACITY = 12;
    private final int EMPLTY_VALUE = -1;
    private int[] arrayOfRymers = new int[CAPACITY];
    public int currentSize = EMPLTY_VALUE;

    public void countIn(int in) {
        if (!isFull())
            arrayOfRymers[++currentSize] = in;
    }

    public boolean callCheck() {
        return currentSize == EMPLTY_VALUE;
    }

    public boolean isFull() {
        return currentSize == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPLTY_VALUE;
        return arrayOfRymers[currentSize];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return arrayOfRymers[currentSize--];
    }

}
