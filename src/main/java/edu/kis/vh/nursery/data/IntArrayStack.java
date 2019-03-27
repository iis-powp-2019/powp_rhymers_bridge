package edu.kis.vh.nursery.data;

public class IntArrayStack implements DataProvider {


    private int total = EMPTY_POSITION;
    private final int[] NUMBERS = new int[STACK_CAPACITY];


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
        return total == EMPTY_POSITION;
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
            return EMPTY_POSITION;

        return NUMBERS[total];
    }

    /**
     * @return pop last element in stack
     */
    public int countOut() {
        if (callCheck())
            return EMPTY_POSITION;

        return NUMBERS[total--];
    }

}
