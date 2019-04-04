package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer {
    IntLinkedList intLinkedList;

    public DefaultCountingOutRhymer() {
        intLinkedList = new IntLinkedList();
    }

    public DefaultCountingOutRhymer(IntLinkedList intLinkedList) {
        this.intLinkedList = intLinkedList;
    }

    public void countIn(int in) {
        intLinkedList.push(in);
    }

    public boolean callCheck() {
        return intLinkedList.isEmpty();
    }

    public boolean isFull() {
        return intLinkedList.isFull();
    }

    public int peekaboo() {
        return intLinkedList.top();
    }

    public int countOut() {
        return intLinkedList.pop();
    }

    public int getIndexOutOfArray(){
        if(intLinkedList.isEmpty())
            return -1;
        else
            return 0;
    }
}
