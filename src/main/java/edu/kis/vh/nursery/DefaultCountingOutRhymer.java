package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer {
    IntArrayStack intArrayStack = new IntArrayStack();
    IntLinkedList intLinkedList = new IntLinkedList();

    public DefaultCountingOutRhymer(){

    }

    public DefaultCountingOutRhymer(IntLinkedList intLinkedList) {
        this.intLinkedList = intLinkedList;
    }

    public void countIn(int in) {
        //intArrayStack.countIn(in);
        intLinkedList.push(in);
    }

    public boolean callCheck() {
        //return intArrayStack.callCheck();
        return intLinkedList.isEmpty();
    }

    public boolean isFull() {
        //return intArrayStack.isFull();
        return intLinkedList.isFull();
    }

    public int peekaboo() {
        //return intArrayStack.peekaboo();
        return intLinkedList.top();
    }

    public int countOut() {
        //return intArrayStack.countOut();
        return intLinkedList.pop();
    }
}
