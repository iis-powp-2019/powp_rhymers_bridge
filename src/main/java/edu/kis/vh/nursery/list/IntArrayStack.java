package edu.kis.vh.nursery.list;

public class IntArrayStack {

    public static final int STACK_MAX_CAPACITY = 12;
    public static final int EMPTY_INDEX_VALUE = -1;

    private final int[] stack = new int[STACK_MAX_CAPACITY];
    private int currIndex = EMPTY_INDEX_VALUE;

    /**
     * Get index which indicative top of the stack
     *
     * @return this index
     */
    public int getCurrIndex() {
        return currIndex;
    }

    /**
     * Add integer value to the stack
     *
     * @param in the value that will be added to the stack
     */
    public void countIn(int in) {
        if (!isFull())
            stack[++currIndex] = in;
    }

    /**
     * @return true, if the stack is empty, otherwise false
     */
    public boolean callCheck() {
        return currIndex == EMPTY_INDEX_VALUE;
    }

    /**
     * @return true, if the stack is full, otherwise false
     */
    public boolean isFull() {
        return currIndex == (STACK_MAX_CAPACITY - 1);
    }

    /**
     * Get value from the top of the stack WITHOUT decrease stack pointer
     *
     * @return EMPTY_INDEX_VALUE if stack is empty, otherwise value from the top of stack
     */
    protected int peekaboo() {
        if (callCheck())
            return EMPTY_INDEX_VALUE;

        return stack[currIndex];
    }

    /**
     * Get value from the top of the stack WITH decrease stack pointer
     *
     * @return EMPTY_INDEX_VALUE if stack is empty, otherwise value from the top of stack
     */
    public int countOut() {
        if (callCheck())
            return EMPTY_INDEX_VALUE;

        return stack[currIndex--];
    }
}


