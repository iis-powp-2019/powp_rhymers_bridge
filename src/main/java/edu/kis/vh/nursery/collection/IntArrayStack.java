package edu.kis.vh.nursery.collection;

/**
 * Class storing array implementation of stack
 */
@Deprecated
public class IntArrayStack implements IntCollection {

    /**
     * Value of {@link #total total} when rhymer stores no numbers
     */
    private static final int NUMBERS_EMPTY = -1;

    /**
     * Value returned by {@link #top() top()} or {@link #pop() pop()} when rhymer stores no number
     */
    private static final int NUMBERS_EMPTY_VALUE = -1;

    /**
     * Maximum quantity of numbers to store in rhymer
     */
    private static final int NUMBERS_MAX_SIZE = 12;

    /**
     * Array of numbers stored in rhymer
     */
    private final int[] NUMBERS = new int[NUMBERS_MAX_SIZE];

    @Override
    public int getElementCount() {
        return total;
    }

    /**
     * Quantity of numbers stored in rhymer
     */
    private int total = NUMBERS_EMPTY;

    @Override
    public void push(int in) {

        if (!isFull())
            NUMBERS[++total] = in;
    }

    @Override
    public boolean isEmpty() {
        return total == NUMBERS_EMPTY;
    }

    @Override
    public boolean isFull() {
        return total == NUMBERS_MAX_SIZE-1;
    }

    @Override
    public int top() {

        if (isEmpty())
            return NUMBERS_EMPTY_VALUE;
        return NUMBERS[total];
    }

    @Override
    public int pop() {

        if (isEmpty())
            return NUMBERS_EMPTY_VALUE;
        return NUMBERS[total--];
    }
}
