package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntArrayStack;

public class DefaultCountingOutRhymer {

    private IntArrayStack intArrayStack = new IntArrayStack();

    public DefaultCountingOutRhymer() {
    }

    public DefaultCountingOutRhymer(IntArrayStack intArrayStack) {
        this.intArrayStack = intArrayStack;
    }

    public int getCurrIndex() {
        return intArrayStack.getCurrIndex();
    }

    /**
     * Add integer value to the stack
     *
     * @param in the value that will be added to the stack
     */
    public void countIn(int in) {
        intArrayStack.countIn(in);
    }

    /**
     * @return true, if the stack is empty, otherwise false
     */
    public boolean callCheck() {
        return intArrayStack.callCheck();
    }

    /**
     * @return true, if the stack is full, otherwise false
     */
    public boolean isFull() {
        return intArrayStack.isFull();
    }

    /**
     * Get value from the top of the stack WITHOUT decrease stack pointer
     *
     * @return EMPTY_INDEX_VALUE if stack is empty, otherwise value from the top of stack
     */
    protected int peekaboo() {
        return intArrayStack.peekaboo();
    }

    /**
     * Get value from the top of the stack WITH decrease stack pointer
     *
     * @return EMPTY_INDEX_VALUE if stack is empty, otherwise value from the top of stack
     */
    public int countOut() {
        return intArrayStack.countOut();
    }
}
