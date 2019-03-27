package edu.kis.vh.nursery.list;

import edu.kis.vh.nursery.Rhymer;

public class IntArrayStack implements Rhymer {

    private static final int MAX_NUMBERS_COUNT = 12;
    private static final int STACK_EMPTY_VALUE = -1;
    private int[] numbers = new int[MAX_NUMBERS_COUNT];

    /**
     * Total amount of numbers amassed in rhymer.
     */
    public int total = STACK_EMPTY_VALUE;

    /**
     * Add numbers to rhymer until it is full.
     *
     * @param in number to count in to rhymer
     * @see IntArrayStack#isFull
     */
    @Override
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Check if count out has finished.
     *
     * @return true if count out has finished and rhymer can't produce any more values.
     * @return false if rhymer can still count out numbers.
     * @see IntArrayStack#countOut
     */
    @Override
    public boolean callCheck() {
        return total == STACK_EMPTY_VALUE;
    }

    /**
     * Checks if count out rhymer can take more numbers.
     *
     * @return true if rhymer is full and can't take more numbers
     * @return false if rhymer is still capable of counting in more numbers.
     * @see IntArrayStack#countIn
     */
    @Override
    public boolean isFull() {
        return total == MAX_NUMBERS_COUNT - 1;
    }

    /**
     * Peeks current number in count out.
     *
     * @return Number at current position in count out
     */
    @Override
    public int peekaboo() {
        if (callCheck())
            return STACK_EMPTY_VALUE;
        return numbers[total];
    }

    /**
     * Count out number and remove it from rhymer.
     *
     * @return Counted out number or -1 if count out has finished.
     */
    @Override
    public int countOut() {
        if (callCheck())
            return STACK_EMPTY_VALUE;
        return numbers[total--];
    }

}
