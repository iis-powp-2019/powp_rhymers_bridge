package edu.kis.vh.nursery.stackImpl;

public class IntArrayStack implements IntStack {

    public static final int STACK_MAX_CAPACITY = 12;

    private final int[] stack = new int[STACK_MAX_CAPACITY];
    private int currIndex = STACK_EMPTY_INDEX;

    /**
     * Add integer value to the stack
     *
     * @param in the value that will be added to the stack
     */
    @Override
    public void countIn(int in) {
        if (!isFull())
            stack[++currIndex] = in;
    }

    /**
     * @return true, if the stack is empty, otherwise false
     */
    @Override
    public boolean callCheck() {
        return currIndex == STACK_EMPTY_INDEX;
    }

    /**
     * @return true, if the stack is full, otherwise false
     */
    @Override
    public boolean isFull() {
        return currIndex == (STACK_MAX_CAPACITY - 1);
    }

    /**
     * Get value from the top of the stack WITHOUT decrease stack pointer
     *
     * @return EMPTY_INDEX_VALUE if stack is empty, otherwise value from the top of stack
     */
    @Override
    public int peekaboo() {
        if (callCheck())
            return STACK_EMPTY_INDEX;

        return stack[currIndex];
    }

    /**
     * Get value from the top of the stack WITH decrease stack pointer
     *
     * @return EMPTY_INDEX_VALUE if stack is empty, otherwise value from the top of stack
     */
    @Override
    public int countOut() {
        if (callCheck())
            return STACK_EMPTY_INDEX;

        return stack[currIndex--];
    }
}


