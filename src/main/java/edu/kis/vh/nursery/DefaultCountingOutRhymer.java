package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int CAPACITY = 12;
    private static final int MAX_INDEX = 11;
    private static final int EMPTY = -1;

    private int[] numbers = new int[CAPACITY];

    private int total = EMPTY;

    void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    boolean callCheck() {
        return total == -1;
    }

    boolean isFull() {
        return total == MAX_INDEX;
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
