package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer {

    private IntLinkedList intLinkedList;

    public DefaultCountingOutRhymer(IntLinkedList intLinkedList) {
        this.intLinkedList = intLinkedList;
    }

    public DefaultCountingOutRhymer() {
        intLinkedList = new IntLinkedList();
    }

    public void countIn(int in) {
        intLinkedList.push(in);
    }

    boolean callCheck() {
        return intLinkedList.isEmpty();
    }

    boolean isFull() {
        return intLinkedList.isFull();
    }

    int peekaboo() {
        return intLinkedList.top();
    }

    public int countOut() {
        return intLinkedList.pop();
    }
}
