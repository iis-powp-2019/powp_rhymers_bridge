package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int STACK_CAPACITY = 12;
    private static final int EMPTY_STACK_SIZE = -1;

    private int[] numbers = new int[STACK_CAPACITY];
    private int total = EMPTY_STACK_SIZE;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    protected void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    protected boolean callCheck() {
        return total == -1;
    }


    private boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    protected int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
