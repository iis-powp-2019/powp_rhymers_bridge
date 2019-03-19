package edu.kis.vh.nursery;

/**
 * DefaultCountingOutRhymer is class, which is base implementation for rhymers.
 *
 * It can count in numbers up to pre-defined value, and count them out in stack-similiar way.
 */
public class DefaultCountingOutRhymer {

    private static final int MAX_NUMBERS_COUNT = 12;
    private static final int COUNT_OUT_FINISHED = -1;
    private int[] numbers = new int[MAX_NUMBERS_COUNT];

    /**
     * Total amount of numbers amassed in rhymer.
     */
    public int total = COUNT_OUT_FINISHED;

    /**
     * Add numbers to rhymer until it is full.
     *
     * @param in number to count in to rhymer
     * @see DefaultCountingOutRhymer#isFull
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Check if count out has finished.
     *
     * @return true if count out has finished and rhymer can't produce any more values.
     * @return false if rhymer can still count out numbers.
     * @see DefaultCountingOutRhymer#countOut
     */
    public boolean callCheck() {
        return total == COUNT_OUT_FINISHED;
    }

    /**
     * Checks if count out rhymer can take more numbers.
     *
     * @return true if rhymer is full and can't take more numbers
     * @return false if rhymer is still capable of counting in more numbers.
     * @see DefaultCountingOutRhymer#countIn
     */
    public boolean isFull() {
        return total == MAX_NUMBERS_COUNT - 1;
    }

    /**
     * Peeks current number in count out.
     *
     * @return Number at current position in count out
     */
    protected int peekaboo() {
        if (callCheck())
            return COUNT_OUT_FINISHED;
        return numbers[total];
    }

    /**
     * Count out number and remove it from rhymer.
     *
     * @return Counted out number or -1 if count out has finished.
     */
    public int countOut() {
        if (callCheck())
            return COUNT_OUT_FINISHED;
        return numbers[total--];
    }

    /**
     * Get count of numbers stored in rhymer
     *
     * @return Total amount of numbers amassed in rhymer.
     */
    public int getTotal() {
        return total;
    }
}
