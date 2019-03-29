package edu.kis.vh.nursery.stack;

public class IntArrayStack implements Stack {

    private static final int STACK_CAPACITY = 12;

    private final int[] numbers = new int[STACK_CAPACITY];

    private int total = Stack.EMPTY_STACK_VALUE;

    /* (non-Javadoc)
     * @see edu.kis.vh.nursery.Stack#getTotal()
     */
    @Override
    public int getTotal() {
        return total;
    }

    /* (non-Javadoc)
     * @see edu.kis.vh.nursery.Stack#countIn(int)
     */
    @Override
    public void countIn(final int in) {
        if (!isFull()) {
            numbers[++total] = in;
        }

    }

    /* (non-Javadoc)
     * @see edu.kis.vh.nursery.Stack#callCheck()
     */
    @Override
    public boolean callCheck() {
        return total == Stack.EMPTY_STACK_VALUE;
    }

    /* (non-Javadoc)
     * @see edu.kis.vh.nursery.Stack#isFull()
     */
    @Override
    public boolean isFull() {
        return total == STACK_CAPACITY - 1;
    }

    /* (non-Javadoc)
     * @see edu.kis.vh.nursery.Stack#peekaboo()
     */
    @Override
    public int peekaboo() {
        if (callCheck()) {
            return Stack.EMPTY_STACK_VALUE;
        }
        return numbers[total];
    }

    /* (non-Javadoc)
     * @see edu.kis.vh.nursery.Stack#countOut()
     */
    @Override
    public int countOut() {
        if (callCheck()) {
            return Stack.EMPTY_STACK_VALUE;
        }
        return numbers[total--];
    }

}
