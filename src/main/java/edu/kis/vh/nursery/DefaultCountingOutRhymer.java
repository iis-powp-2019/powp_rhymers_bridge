package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int TOTAL_FULL_VALUE = 11;

    private static final int TOTAL_VALUE = -1;

    private static final int MAX_SIZE = 12;

    // alt + <- powrót do wcześniej modyfikowanego pliku
    // alt + -> przejście do następnego pliku

    private int[] numbers = new int[MAX_SIZE];

    public int total = TOTAL_VALUE;

    public void countIn(int in) {
        if (!isFull()) {
            numbers[++total] = in;
        }
    }

    public boolean callCheck() {
        return total == TOTAL_VALUE;
    }

    public boolean isFull() {
        return total == TOTAL_FULL_VALUE;
    }

    protected int peekaboo() {
        if (callCheck()) {
            return TOTAL_VALUE;
        }
        return numbers[total];
    }

    public int countOut() {
        if (callCheck()) {
            return TOTAL_VALUE;
        }
        return numbers[total--];
    }

}
