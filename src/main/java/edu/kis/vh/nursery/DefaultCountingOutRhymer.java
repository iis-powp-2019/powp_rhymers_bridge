package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int STATE_SIZE = 12;
    public static final int NEGATIVE_NUMBER = -1;
    public static final int FULL_NUMBER = 11;
    public static final int ENTYTY_NUMBER = -1;
    private int[] numbers = new int[STATE_SIZE];

    public int total = ENTYTY_NUMBER;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == NEGATIVE_NUMBER;
    }

    public boolean isFull() {
        return total == FULL_NUMBER;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
