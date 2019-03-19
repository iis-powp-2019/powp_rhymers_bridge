package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int STACK_CAPACITY = 12;
    private static final int MIN_TOTAL_VALUE = -1;
    private int[] numbers = new int[STACK_CAPACITY];

    public int getTotal() {
        return total;
    }

    private int total = MIN_TOTAL_VALUE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    boolean callCheck() {
        return total == MIN_TOTAL_VALUE;
    }

    boolean isFull() {
        return total == 11;
    }

    int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
