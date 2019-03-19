package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int TOTAL_FULL_VALUE = 11;

    private static final int TOTAL_VALUE = -1;

    private static final int MAX_SIZE = 12;

    // alt + <- powrót do wcześniej modyfikowanego pliku
    // alt + -> przejście do następnego pliku

    private int[] numbers = new int[MAX_SIZE];

    private int total = TOTAL_VALUE;

    protected void countIn(int in) {
        if (!isFull()) {
            numbers[++total] = in;
        }
    }

    protected boolean callCheck() {
        return total == TOTAL_VALUE;
    }

    protected boolean isFull() {
        return total == TOTAL_FULL_VALUE;
    }

    protected int peekaboo() {
        if (callCheck()) {
            return TOTAL_VALUE;
        }
        return numbers[total];
    }

    protected int countOut() {
        if (callCheck()) {
            return TOTAL_VALUE;
        }
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }

    private void setTotal(int total) {
        this.total = total;
    }

    private int[] getNumbers() {
        return numbers;
    }

    private void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    private static int getMaxSize() {
        return MAX_SIZE;
    }

    private static int getTotalFullValue() {
        return TOTAL_FULL_VALUE;
    }

}
