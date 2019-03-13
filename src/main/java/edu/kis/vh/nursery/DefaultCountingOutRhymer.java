package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int capacity = 12;
    private static final int indexOutOfArray = -1;
    private int[] numbers = new int[capacity];

    private int total = indexOutOfArray;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == indexOutOfArray;
    }

    public boolean isFull() {
        return total == capacity - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return indexOutOfArray;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return indexOutOfArray;
        return numbers[total--];
    }

}
