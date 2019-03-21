package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer {

    //IntArrayStack intArrayStack;
    IntLinkedList intLinkedList;

    public DefaultCountingOutRhymer(IntLinkedList intLinkedList) {
        //this.intArrayStack = intArrayStack;
        this.intLinkedList = intLinkedList;

    }

    public DefaultCountingOutRhymer() {
        this.intLinkedList = new IntLinkedList();
    }

    public void countIn(int in) {
        //intArrayStack.countIn(in);
        intLinkedList.push(in);
    }

    public boolean callCheck() {
        return //intArrayStack.callCheck();
                intLinkedList.isEmpty();
    }

    public boolean isFull() {
        return //intArrayStack.isFull();
                intLinkedList.isFull();
    }

    public int peekaboo() {
        return //intArrayStack.peekaboo();
                intLinkedList.top();
    }

    public int countOut() {
        return //intArrayStack.countOut();
                intLinkedList.pop();
    }
}
