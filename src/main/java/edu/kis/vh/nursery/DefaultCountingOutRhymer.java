package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.datastructures.IntLinkedList;

public class DefaultCountingOutRhymer {

    private Stack stack;

    public int getTotal() {
        return stack.getTotal();
    }

    public void countIn(int i) {
        stack.countIn(i);
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
        stack = new IntLinkedList();
    }

    public DefaultCountingOutRhymer(Stack stack) {
        super();
        this.stack = stack;
    }

}
