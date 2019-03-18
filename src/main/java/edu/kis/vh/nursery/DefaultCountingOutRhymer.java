package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int MAX_VALUE = 11;
    private static final int DEFAULT_INDEX = -1;
    private static final int CAPACITY = 12;

    private int[] NUMBERS = new int[getCAPACITY()];

    public static int getMaxValue() {
        return MAX_VALUE;
    }

    public static int getDefaultIndex() {
        return DEFAULT_INDEX;
    }

    public static int getCAPACITY() {
        return CAPACITY;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

    private int total = getDefaultIndex();

    protected void countIn(int in) {
        if (!isFull())
            getNUMBERS()[++total] = in;
    }

    protected boolean callCheck() {
        return total == getDefaultIndex();
    }

    protected boolean isFull() {
        return total == getMaxValue();
    }

    protected int peekaboo() {
        if (callCheck())
            return getDefaultIndex();
        return getNUMBERS()[total];
    }

    protected int countOut() {
        if (callCheck())
            return getDefaultIndex();
        return getNUMBERS()[total--];
    }

    public int[] getNUMBERS() {
        return NUMBERS;
    }

    public void setNUMBERS(int[] NUMBERS) {
        this.NUMBERS = NUMBERS;
    }
}
