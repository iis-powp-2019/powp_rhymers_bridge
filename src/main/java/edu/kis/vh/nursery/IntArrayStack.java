package edu.kis.vh.nursery;

public class IntArrayStack implements Stack {

    private static final int TOTAL_VALUE = -1;

    private static final int MAX_SIZE = 12;

    private final int[] numbers = new int[MAX_SIZE];

    private int total = TOTAL_VALUE;

    /* (non-Javadoc)
     * @see edu.kis.vh.nursery.Stack#getTotal()
     */
    @Override
    public int getTotal() {
        return total;
    }

    /* (non-Javadoc)
     * @see edu.kis.vh.nursery.Stack#countIn(int)
     */
    @Override
    public void countIn(final int in) {
        if (!isFull()) {
            numbers[++total] = in;
        }
    }

    /* (non-Javadoc)
     * @see edu.kis.vh.nursery.Stack#callCheck()
     */
    @Override
    public boolean callCheck() {
        return total == TOTAL_VALUE;
    }

    /* (non-Javadoc)
     * @see edu.kis.vh.nursery.Stack#isFull()
     */
    @Override
    public boolean isFull() {
        return total == 11;
    }

    /* (non-Javadoc)
     * @see edu.kis.vh.nursery.Stack#peekaboo()
     */
    @Override
    public int peekaboo() {
        if (callCheck()) {
            return TOTAL_VALUE;
        }
        return numbers[total];
    }

    /* (non-Javadoc)
     * @see edu.kis.vh.nursery.Stack#countOut()
     */
    @Override
    public int countOut() {
        if (callCheck()) {
            return TOTAL_VALUE;
        }
        return numbers[total--];
    }
}
