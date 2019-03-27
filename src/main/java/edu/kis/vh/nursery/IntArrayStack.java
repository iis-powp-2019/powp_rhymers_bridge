package edu.kis.vh.nursery;

public class IntArrayStack {

    private static final int COUNTFINISH = -1;
    private static final int MAX = 11;
    final private int[] numbers = new int[12];

    private int total = COUNTFINISH;

    public int getTotal() {
        return total;
    }


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
