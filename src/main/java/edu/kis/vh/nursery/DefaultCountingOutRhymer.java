package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntStack;

public class DefaultCountingOutRhymer {

    private IntStack intLinkedList = new IntStack();

    public DefaultCountingOutRhymer(IntStack intLinkedList) {
        this.intLinkedList = intLinkedList;
    }

    public DefaultCountingOutRhymer(){

    }

    public void countIn(int in) {
        intLinkedList.push(in);
    }

    public int countOut() {
        return intLinkedList.pop();
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
}
