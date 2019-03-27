package edu.kis.vh.nursery;


/**
 * Class which counting down, which is working like a stack.
 */
public class IntArrayStack {

    private static final int MIN = -1;
    private static final int MAX = 11;
    private static final int MAX_SIZE_NUMBERS = 12;
    private int[] numbers = new int[MAX_SIZE_NUMBERS];

    private int total = -1;

    /**
     * @return actual number elements of stacks;
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param IN number which is using to fill the stack.
     */
    public void countIn(final int IN) {
        if (!isFull())
            numbers[++total] = IN;
    }

    /**
     * @return return true, if stack is empty and false, if it's not.
     */
    public boolean callCheck() {
        return total == MIN;
    }

    /**
     * @return return true, if stack is full and false, if stack is not.
     */
    public boolean isFull() {
        return total == MAX;
    }

    /**
     * @return return -1, if stack is empty or actual element, if its not.
     */
    protected int peekaboo() {
        if (callCheck())
            return MIN;
        return numbers[total];
    }

    /**
     * @return return -1, if stack is empty or under the top element, if its not.
     */
    public int countOut() {
        if (callCheck())
            return MIN;
        return numbers[total--];
    }

}
