package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int NUMBERS_EMPTY = -1;
    private static final int NUMBERS_EMPTY_VALUE = -1;
    private static final int NUMBERS_MAX_SIZE = 12;
    private int[] numbers = new int[NUMBERS_MAX_SIZE];

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    private int total = NUMBERS_EMPTY;

    public void countIn(int in) {

        if (!isFull())
            numbers[++total] = in;
    }

    boolean callCheck() {
        return total == NUMBERS_EMPTY;
    }

    boolean isFull() {
        return total == NUMBERS_MAX_SIZE-1;
    }

    int peekaboo() {

        if (callCheck())
            return NUMBERS_EMPTY_VALUE;
        return numbers[total];
    }

    public int countOut() {

        if (callCheck())
            return NUMBERS_EMPTY_VALUE;
        return numbers[total--];
    }

}
