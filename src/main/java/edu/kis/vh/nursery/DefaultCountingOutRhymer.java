package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer {

    IntLinkedList intLinkedList;
    private static final int NO_ANY_ELEMENTS = -1;

    public DefaultCountingOutRhymer(IntLinkedList intLinkedList) {
        this.intLinkedList = intLinkedList;
    }

    public DefaultCountingOutRhymer() {
        this.intLinkedList = new IntLinkedList();
    }

    public void countIn(int in) {
        intLinkedList.push(in);
    }

    public boolean callCheck() {
        return intLinkedList.isEmpty();
    }

    public boolean isFull() {
        return false;
    }

    public int peekaboo() {
        if (callCheck())
            return NO_ANY_ELEMENTS;
        return intLinkedList.top();
    }

    public int countOut() {
        if (callCheck())
            return NO_ANY_ELEMENTS;
        return intLinkedList.pop();
    }
}
