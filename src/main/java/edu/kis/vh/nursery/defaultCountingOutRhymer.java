package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int DEFAULT_RETURN_VALUE = -1;
    private static final int FULL_STACK = 11;
    private static final int MAX_STACK_SIZE = 12;
    private int[] numbers = new int[MAX_STACK_SIZE];
    private int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    boolean callCheck() {
        return total == DEFAULT_RETURN_VALUE;
    }

    boolean isFull() {
        return total == FULL_STACK;
    }

    int peekaboo() {
        if (callCheck())
            return DEFAULT_RETURN_VALUE;
        return numbers[total];
    }

    int countOut() {
        if (callCheck())
            return DEFAULT_RETURN_VALUE;
        return numbers[total--];
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
