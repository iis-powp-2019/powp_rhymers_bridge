package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private int[] arrayOfRymers = new int[12];
    public int currentSize = -1;

    public void countIn(int in) {
        if (!isFull())
            arrayOfRymers[++currentSize] = in;
    }

    public boolean callCheck() {
        return currentSize == -1;
    }

    public boolean isFull() {
        return currentSize == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return arrayOfRymers[currentSize];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return arrayOfRymers[currentSize--];
    }

}
