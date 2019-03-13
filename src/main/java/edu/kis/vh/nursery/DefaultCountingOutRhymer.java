package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int ERROR = -1;
    public static final int MAX_STACK = 12;
    public static final int CAPACITY = 11;
    private int[] numbers = new int[MAX_STACK];

    public int total = ERROR;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == ERROR;
    }

    public boolean isFull() {
        return total == CAPACITY;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ERROR;
        return numbers[total--];
    }

}
