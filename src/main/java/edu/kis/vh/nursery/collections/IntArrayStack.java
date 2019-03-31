package edu.kis.vh.nursery.collections;

import edu.kis.vh.nursery.Collections;

/**
 * @author Maciek Implementing a stack of integers with pointer on last added element.
 */
public class IntArrayStack implements Collections {

    /**
     * Index of stack overflow
     */
    private static final int STACK_MAX_SIZE = 12;

    /**
     * The collector of stack elements
     */
    private int[] numbers = new int[STACK_MAX_SIZE];

    /**
     * index of stack last element
     */
    private int total = -1;

    /*
     * (non-Javadoc)
     *
     * @see edu.kis.vh.nursery.Collections#countIn(int)
     */
    @Override
    public void countIn(final int in) {
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
        return total == COLLECTION_EMPTY_INDEX;
    }

    /*
     * (non-Javadoc)
     *
     * @see edu.kis.vh.nursery.Collections#isFull()
     */
    @Override
    public boolean isFull() {
        return total == STACK_MAX_SIZE - 1;
    }

    /*
     * (non-Javadoc)
     *
     * @see edu.kis.vh.nursery.Collections#peekaboo()
     */
    @Override
    public int peekaboo() {
        if (callCheck()) {
            return COLLECTION_EMPTY_INDEX;
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
            return COLLECTION_EMPTY_INDEX;
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
}
