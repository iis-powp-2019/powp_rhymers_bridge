package edu.kis.vh.nursery;

/**
 *  class of own queue impl
 */
public class DefaultCountingOutRhymer {

    private static final int MAX_SIZE_OF_QUEUE = 12;
    private static final int EMPTY_POSITION = -1;
    private final int[] queue = new int[MAX_SIZE_OF_QUEUE];

    private int currentIndex = EMPTY_POSITION;

    /**
     *
     * @return value of currentIndex field
     */
    public int getCurrentIndex() {
        return currentIndex;
    }

    /** add passed integer to queue
     *
     * @param in - input integer to add it to queue
     */
    public void countIn(int in) {
        if (!isFull())
            queue[++currentIndex] = in;
    }

    /**check if queue is empty
     *
     * @return boolen value from checking if queue is empty
     */
    public boolean callCheck() {
        return currentIndex == EMPTY_POSITION;
    }

    /**check if queue is full
     *
     * @return boolen value from checking if queue is full
     */
    public boolean isFull() {
        return currentIndex == MAX_SIZE_OF_QUEUE - 1;
    }

    /**
     *
     * @return value of last queue position
     */
    protected int peekaboo() {
        if (callCheck()) {
            return EMPTY_POSITION;
        }
        return queue[currentIndex];
    }

    /**value of last queue position and decrement current position
     *
     * @return value of last queue position
     */
    public int countOut() {
        if (callCheck()) {
            return EMPTY_POSITION;
        }
        return queue[currentIndex--];
    }

}
