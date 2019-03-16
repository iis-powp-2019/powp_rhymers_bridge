package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer implements IStackInt {
    IntLinkedList intLinkedList;

    public DefaultCountingOutRhymer() {
        this.intLinkedList = new IntLinkedList();
    }

    public DefaultCountingOutRhymer(IntLinkedList intLinkedList) {
        this.intLinkedList = intLinkedList;
    }

    @Override
    public void countIn(int in) {
        intLinkedList.countIn(in);
    }

    @Override
    public boolean callCheck() {
        return intLinkedList.callCheck();
    }

    @Override
    public boolean isFull() {
        return intLinkedList.isFull();
    }

    @Override
    public int countOut() {
        return intLinkedList.countOut();
    }

    @Override
    public int peekaboo() {
        return intLinkedList.peekaboo();
    }
}
