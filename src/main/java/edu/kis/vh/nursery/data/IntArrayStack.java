package edu.kis.vh.nursery.data;

public class IntArrayStack implements DataProvider {

    private static final int EMPTY_POSITION = -1;
    private int total = getEmptyPosition();
    private final int[] NUMBERS = new int[STACK_CAPACITY];

    public static int getEmptyPosition() {
        return EMPTY_POSITION;
    }

    /**
     * @param in if stack is not full push new element to stack
     */
    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }
    /**
     * @return check if last element is empty
     */
    public boolean callCheck() {
        return total == getEmptyPosition();
    }

    /**
     * @return check if stack is full
     */
    public boolean isFull() {
        return total == STACK_CAPACITY - 1;
    }

    /**
     * @return if last element is not empty returns value of it
     */
    public int peekaboo() {
        if (callCheck())
            return getEmptyPosition();

        return NUMBERS[total];
    }

    /**
     * @return pop last element in stack
     */
    public int countOut() {
        if (callCheck())
            return getEmptyPosition();

        return NUMBERS[total--];
    }

}
