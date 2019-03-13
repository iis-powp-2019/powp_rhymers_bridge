package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int CAPACITY = 12;
    private static final int MAX_SIZE = 11;
    private static final int EMPTY = -1;
    private int[] numbers = new int[getCAPACITY()];

    private int total = getEMPTY();

    public static int getCAPACITY() {
        return CAPACITY;
    }

    public static int getMaxSize() {
        return MAX_SIZE;
    }

    public static int getEMPTY() {
        return EMPTY;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }


    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == getEMPTY();
    }

    public boolean isFull() {
        return total == getMaxSize();
    }

    protected int peekaboo() {
        if (callCheck())
            return getEMPTY();
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return getEMPTY();
        return numbers[total--];
    }

}
