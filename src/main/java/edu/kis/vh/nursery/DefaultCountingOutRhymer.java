package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer {
    IntLinkedList intLinkedStack;

    public void countIn(int IN) {
        intLinkedStack.push(IN);
    }

    public boolean callCheck() {
        return intLinkedStack.isEmpty();
    }

    public boolean isFull() {
        return intLinkedStack.isFull();
    }

    public int peekaboo() {
        return intLinkedStack.top();
    }

    public int countOut() {
        return intLinkedStack.pop();
    }

    public DefaultCountingOutRhymer(IntLinkedList intLinkedList) {
        this.intLinkedStack = intLinkedList;
    }

    public DefaultCountingOutRhymer() {
        intLinkedStack = new IntLinkedList();
    }
}
