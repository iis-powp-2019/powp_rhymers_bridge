package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer {
    private IntLinkedList stack;

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

    public int getTotal() {
        return stack.getTotal();
    }

    public DefaultCountingOutRhymer(IntLinkedList intArrayStack) {
        this.stack = intArrayStack;
    }

    public DefaultCountingOutRhymer() {
        this.stack = new IntLinkedList();
    }
}
