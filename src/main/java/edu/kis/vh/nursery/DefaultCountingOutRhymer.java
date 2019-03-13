package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int MAX_NUMBERS_COUNT = 12;
    public static final int COUNT_OUT_FINISHED = -1;
    private int[] numbers = new int[MAX_NUMBERS_COUNT];

    public int total = COUNT_OUT_FINISHED;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == COUNT_OUT_FINISHED;
    }

    public boolean isFull() {
        return total == MAX_NUMBERS_COUNT - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return COUNT_OUT_FINISHED;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return COUNT_OUT_FINISHED;
        return numbers[total--];
    }

}
