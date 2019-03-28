package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer {

    public int getTotal() {
        return intLinkedList.getTotal();
    }

    public void countIn(int i) {
        intLinkedList.countIn(i);
    }

    public boolean callCheck() {
        return intLinkedList.callCheck();
    }

    public boolean isFull() {
        return intLinkedList.isFull();
    }

    public int peekaboo() {
        return intLinkedList.peekaboo();
    }

    public int countOut() {
        return intLinkedList.countOut();
    }

    private IntLinkedList intLinkedList;

    public DefaultCountingOutRhymer() {
        intLinkedList = new IntLinkedList();
    }

    public DefaultCountingOutRhymer(IntLinkedList intLinkedList) {
        super();
        this.intLinkedList = intLinkedList;
    }

}
