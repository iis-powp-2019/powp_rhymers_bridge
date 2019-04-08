package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stacks.IntLinkedList;

/**
 * Stack Class
 */
public class DefaultCountingOutRhymer {
    IntStack stack;

    public DefaultCountingOutRhymer() {
        stack = new IntLinkedList();
    }

    public int getTotal() {
        return stack.getTotal();
    }

    public void countIn(int in) {
        stack.countIn(in);
    }

    public boolean callCheck() {
        return stack.callCheck();
    }

    public boolean isFull() {
        return stack.isFull();
    }

    public int peekaboo() {
        return stack.peekaboo();
    }

    public int countOut() {
        return stack.countOut();
    }
}
