package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int capacity = 12;
    public static final int indexOutOfArray = -1;
    private int[] numbers = new int[capacity];

    public int total = indexOutOfArray;

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
