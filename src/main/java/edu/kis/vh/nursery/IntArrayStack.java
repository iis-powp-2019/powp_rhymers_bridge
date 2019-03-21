package edu.kis.vh.nursery;

public class IntArrayStack {
    private static final int ERROR = -1;
    private static final int MAX_STACK = 12;
    private static final int CAPACITY = 11;
    private int[] numbers = new int[MAX_STACK];

    private int total = ERROR;

    protected void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    protected boolean callCheck() {
        return total == ERROR;
    }

    protected boolean isFull() {
        return total == CAPACITY;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR;
        return numbers[total];
    }

    protected int countOut() {
        if (callCheck())
            return ERROR;
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }

}
