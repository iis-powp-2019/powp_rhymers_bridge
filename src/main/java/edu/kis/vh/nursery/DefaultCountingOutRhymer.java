package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stackImpl.IntLinkedList;
import edu.kis.vh.nursery.stackImpl.IntStack;

public class DefaultCountingOutRhymer {

    private IntStack intLinkedListStack;

    public DefaultCountingOutRhymer() {
        intLinkedListStack = new IntLinkedList();
    }

    public DefaultCountingOutRhymer(IntStack intArrayStack) {
        this.intLinkedListStack = intArrayStack;
    }

    /**
     * Add integer value to the stack
     *
     * @param in the value that will be added to the stack
     */
    public void countIn(int in) {
        intLinkedListStack.countIn(in);
    }

    /**
     * @return true, if the stack is empty, otherwise false
     */
    public boolean callCheck() {
        return intLinkedListStack.callCheck();
    }

    /**
     * @return true, if the stack is full, otherwise false
     */
    public boolean isFull() {
        return intLinkedListStack.isFull();
    }

    /**
     * Get value from the top of the stack WITHOUT decrease stack pointer
     *
     * @return EMPTY_INDEX_VALUE if stack is empty, otherwise value from the top of stack
     */
    protected int peekaboo() {
        return intLinkedListStack.peekaboo();
    }

    /**
     * Get value from the top of the stack WITH decrease stack pointer
     *
     * @return EMPTY_INDEX_VALUE if stack is empty, otherwise value from the top of stack
     */
    public int countOut() {
        return intLinkedListStack.countOut();
    }
}
