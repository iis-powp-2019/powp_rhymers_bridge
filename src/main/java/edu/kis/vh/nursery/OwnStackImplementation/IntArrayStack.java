package edu.kis.vh.nursery.OwnStackImplementation;

import edu.kis.vh.nursery.IntStack;

/**
 *  class of own queue impl
 */
public class IntArrayStack implements IntStack {

    private static final int MAX_SIZE_OF_QUEUE = 12;
    private static final int EMPTY_POSITION = 0;
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
    @Override
    public void countIn(int in) {
        if (!isFull())
            queue[++currentIndex] = in;
    }

    /**check if queue is empty
     *
     * @return boolen value from checking if queue is empty
     */
    @Override
    public boolean callCheck() {
        return currentIndex == EMPTY_POSITION;
    }

    /**check if queue is full
     *
     * @return boolen value from checking if queue is full
     */
    @Override
    public boolean isFull() {
        return currentIndex == MAX_SIZE_OF_QUEUE - 1;
    }

    /**
     *
     * @return value of last queue position
     */
    public int peekaboo() {
        if (callCheck()) {
            return EMPTY_POSITION;
        }
        return queue[currentIndex];
    }

    /**value of last queue position and decrement current position
     *
     * @return value of last queue position
     */
    @Override
    public int countOut() {
        if (callCheck()) {
            return EMPTY_POSITION;
        }
        return queue[currentIndex--];
    }

}
