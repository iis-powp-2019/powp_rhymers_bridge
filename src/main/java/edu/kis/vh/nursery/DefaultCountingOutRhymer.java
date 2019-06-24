package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer {
    private IntLinkedList linkedList;

    public void countIn(int in) {
        linkedList.push(in);
    }

    public boolean callCheck() {
        return linkedList.isEmpty();
    }

    public boolean isFull() {
        return linkedList.isFull();
    }

    public int peekaboo() {
        return linkedList.top();
    }

    public int countOut() {
        return linkedList.pop();
    }


    public DefaultCountingOutRhymer(IntLinkedList list) {
        this.linkedList = list;
    }
    public DefaultCountingOutRhymer() {
        this.linkedList = new IntLinkedList();
    }


}
