package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntStack;
import edu.kis.vh.nursery.stack.list.IntLinkedList;

public class DefaultCountingOutRhymer {

    private IntStack stack;

    public DefaultCountingOutRhymer(IntStack stack) {
        this.stack = stack;
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

    public DefaultCountingOutRhymer() {
        this.stack = new IntLinkedList();
    }

}
