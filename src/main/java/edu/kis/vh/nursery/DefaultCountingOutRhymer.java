package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {


    public static final int ONE = -1;
    public static final int ELEVEN = 11;

    private int[] numbers = new int[12];

    public int total = ONE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == ONE;
    }

    public boolean isFull() {
        return total == ELEVEN;
    }

    protected int peekaboo() {
        if (callCheck())
            return ONE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ONE;
        return numbers[total--];
    }

}
