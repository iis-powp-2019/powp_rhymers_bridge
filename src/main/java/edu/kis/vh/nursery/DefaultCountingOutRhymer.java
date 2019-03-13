package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int COUNTFINISH = -1;
    public static final int MAX = 11;
    private int[] numbers = new int[12];

    public int total = COUNTFINISH;

    public void countIn(int in) {
        if (!isFull()) {
            numbers[++total] = in;
        }
    }

    public boolean callCheck() {
        return total == COUNTFINISH;
    }

    public boolean isFull() {
        return total == MAX;
    }

    protected int peekaboo() {
        if (callCheck()) {
            return COUNTFINISH;
        }
        return numbers[total];
    }

    public int countOut() {
        if (callCheck()) {
            return COUNTFINISH;
        }
        return numbers[total--];
    }

}
