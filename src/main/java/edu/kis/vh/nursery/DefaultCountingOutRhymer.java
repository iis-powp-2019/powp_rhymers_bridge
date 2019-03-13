package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int FINISH = -1;
    public static final int MAX_NUMBER_OF_ELEMENTS = 12;

    private int[] numbers = new int[MAX_NUMBER_OF_ELEMENTS];

    private int total = FINISH;

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == FINISH;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck()) {
            return FINISH;
        }
        return numbers[getTotal()];
    }

    public int countOut() {
        if (callCheck()) {
            return FINISH;
        }
        return numbers[total--];
    }

}
