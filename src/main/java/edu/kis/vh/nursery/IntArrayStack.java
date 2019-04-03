package edu.kis.vh.nursery;

/**
 * Class storing array implementation of stack
 */

@Deprecated
public class IntArrayStack {

    /**
     * Value of {@link #total total} when rhymer stores no numbers
     */
    private static final int NUMBERS_EMPTY = -1;
    /**
     * Value returned by {@link #peekaboo() peekaboo()} or {@link #countOut() countOut()} when rhymer stores no number
     */
    private static final int NUMBERS_EMPTY_VALUE = -1;
    /**
     * Maximum quantity of numbers to store in rhymer
     */
    private static final int NUMBERS_MAX_SIZE = 12;
    // TODO: needs refactoring to use list.IntLinkedList
    /**
     * Array of numbers stored in rhymer
     */
    private final int[] NUMBERS = new int[NUMBERS_MAX_SIZE];

    /**
     * Getter to {@link #total total} field
     * @return value of {@link #total total} field
     */
    public int getTotal() {
        return total;
    }

    /**
     * Quantity of numbers stored in rhymer
     */
    private int total = NUMBERS_EMPTY;

    /**
     * Adds number to rhymer
     * @param IN value to add to the rhymer
     */
    public void countIn(final int IN) {

        if (!isFull())
            NUMBERS[++total] = IN;
    }

    /**
     * Checks if rhymer number storage is empty
     * @return true when rhymers stores no numbers
     */
    public boolean callCheck() {
        return total == NUMBERS_EMPTY;
    }

    /**
     * Checks if rhymer number storage is full
     * @return true when rhymers can store no more numbers
     */
    public boolean isFull() {
        return total == NUMBERS_MAX_SIZE-1;
    }

    /**
     * Gets value of last added number
     * @return last added number
     */
    public int peekaboo() {

        if (callCheck())
            return NUMBERS_EMPTY_VALUE;
        return NUMBERS[total];
    }

    /**
     * Gets value of last added number, popping it from rhymer storage
     * @return last added number
     */
    public int countOut () {

        if (callCheck())
            return NUMBERS_EMPTY_VALUE;
        return NUMBERS[total--];
    }
}
