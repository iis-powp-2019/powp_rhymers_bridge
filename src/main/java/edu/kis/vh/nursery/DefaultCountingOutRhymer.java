package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int MIN = -1;
    public static final int MAX = 11;
    public static final int SIZE_NUMBERS = 12;
    private int[] numbers = new int[SIZE_NUMBERS];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == MIN;
    }

    public boolean isFull() {
        return total == MAX;
    }

    protected int peekaboo() {
        if (callCheck())
            return MIN;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return MIN;
        return numbers[total--];
    }

}
