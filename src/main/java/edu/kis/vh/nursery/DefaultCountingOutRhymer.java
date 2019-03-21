package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stacks.IntLinkedList;

public class DefaultCountingOutRhymer {

    private StackInterface stack;

    public DefaultCountingOutRhymer(IntLinkedList intLinkedList) {
        this.stack = intLinkedList;
    }

    public DefaultCountingOutRhymer() {
        this.stack = new IntLinkedList();
    }

    public void countIn(int in) {
        this.stack.push(in);
    }

    public boolean callCheck() {
        return stack.isEmpty();
    }

    public boolean isFull() {
        return stack.isFull();
    }

    public int peekaboo() {
        return stack.top();
    }

    public int countOut() {
        return stack.pop();
    }

    public int getTotal() {
        return stack.getHead();
    }
}
