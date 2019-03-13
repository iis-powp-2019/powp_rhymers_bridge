package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int CAPACITY = 12;
    private static final int MAX_SIZE = 11;
    private static final int EMPTY = -1;
    private int[] numbers = new int[getCAPACITY()];

    private int total = getEMPTY();

    /**
     * Get capacity
     * @return
     */
    public static int getCAPACITY() {
        return CAPACITY;
    }

    /**
     * Get max size
     * @return
     */
    public static int getMaxSize() {
        return MAX_SIZE;
    }

    /**
     * Get empty
     * @return
     */
    public static int getEMPTY() {
        return EMPTY;
    }

    /**
     * Get total
     * @return
     */
    public int getTotal() {
        return total;
    }

    /**
     * countIn
     * @param in
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * callCheck
     * @return
     */
    public boolean callCheck() {
        return total == getEMPTY();
    }

    /**
     * Checks if stack is full
     * @return
     */
    public boolean isFull() {
        return total == getMaxSize();
    }

    /**
     * peekaboo
     * @return
     */
    protected int peekaboo() {
        if (callCheck())
            return getEMPTY();
        return numbers[total];
    }

    /**
     * countOut
     * @return
     */
    public int countOut() {
        if (callCheck())
            return getEMPTY();
        return numbers[total--];
    }

}
