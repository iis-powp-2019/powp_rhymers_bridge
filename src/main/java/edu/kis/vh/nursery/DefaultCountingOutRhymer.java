package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer {
    private IntLinkedList intLinkedList;

    private final int COLLECTION_EMPTY_SIZE=-1;

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
        if(intLinkedList.isEmpty())
            return COLLECTION_EMPTY_SIZE;
        return intLinkedList.top();
    }

    public int countOut() {
        return intLinkedList.pop();
    }
}
