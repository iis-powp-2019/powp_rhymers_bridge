package edu.kis.vh.nursery;

/**
 * Stack Class
 */
public class IntArrayStack {

    private final int STACK_MAX_SIZE = 12;
    private final int INITIAL_STACK_INDEX=-1;
    private int[] NUMBERS = new int[STACK_MAX_SIZE];
    private int total = INITIAL_STACK_INDEX;

    /**
     *
     * @return number of elements currently on the stack
     */
    public int getTotal() {
        return total;
    }

    /**
     * Puts element on  the stack
     * @param in element to put on the stack
     */
    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    /**
     *
     * Checks if stack is empty
     * @return true if empty
     */
    boolean callCheck() {
        return total == INITIAL_STACK_INDEX;
    }

    /**
     *Checks if stack is full
     * @return true if stack is full
     */
    boolean isFull() {
        return total == STACK_MAX_SIZE-1;
    }

    /**
     * returns  element from top of the stack
     * @return element from top of the stack
     */
    int peekaboo() {
        if (callCheck())
            return INITIAL_STACK_INDEX;
        return NUMBERS[total];
    }

    /**
     *returns element from top of  the stack and removes it
     * @return  element from top of  the stack
     */
    public int countOut() {
        if (callCheck())
            return INITIAL_STACK_INDEX;
        return NUMBERS[total--];
    }

}
