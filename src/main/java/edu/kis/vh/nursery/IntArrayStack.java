package edu.kis.vh.nursery;

public class IntArrayStack implements Collections {

    private static final int TOTAL_FULL_VALUE = 11;

    private static final int TOTAL_VALUE = -1;

    private static final int MAX_SIZE = 12;

    // alt + <- powrót do wcześniej modyfikowanego pliku
    // alt + -> przejście do następnego pliku

    private final int[] numbers = new int[MAX_SIZE];

    private int total = TOTAL_VALUE;

    /*
     * (non-Javadoc)
     * 
     * @see edu.kis.vh.nursery.Collections#countIn(int)
     */
    @Override
    public void countIn(int in) {
        if (!isFull()) {
            numbers[++total] = in;
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see edu.kis.vh.nursery.Collections#callCheck()
     */
    @Override
    public boolean callCheck() {
        return total == TOTAL_VALUE;
    }

    /*
     * (non-Javadoc)
     * 
     * @see edu.kis.vh.nursery.Collections#isFull()
     */
    @Override
    public boolean isFull() {
        return total == TOTAL_FULL_VALUE;
    }

    /*
     * (non-Javadoc)
     * 
     * @see edu.kis.vh.nursery.Collections#peekaboo()
     */
    @Override
    public int peekaboo() {
        if (callCheck()) {
            return TOTAL_VALUE;
        }
        return numbers[total];
    }

    /*
     * (non-Javadoc)
     * 
     * @see edu.kis.vh.nursery.Collections#countOut()
     */
    @Override
    public int countOut() {
        if (callCheck()) {
            return TOTAL_VALUE;
        }
        return numbers[total--];
    }

    /*
     * (non-Javadoc)
     * 
     * @see edu.kis.vh.nursery.Collections#getTotal()
     */
    @Override
    public int getTotal() {
        return total;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public static int getMaxSize() {
        return MAX_SIZE;
    }

    public static int getTotalFullValue() {
        return TOTAL_FULL_VALUE;
    }
}
