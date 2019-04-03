package edu.kis.vh.nursery;

import edu.kis.vh.nursery.dataStructures.*;

public class DefaultCountingOutRhymer {

    private IStackAndListSimilarities intLinkedList;

    public DefaultCountingOutRhymer() {
        this.intLinkedList = new IntLinkedList();
    }

    public DefaultCountingOutRhymer(IntLinkedList intLinkedList) {
        this.intLinkedList = intLinkedList;
    }

    public DefaultCountingOutRhymer(IntArrayStack intArrayStack) {
        this.intLinkedList = intArrayStack;
    }

    public void countIn(int in) {
        intLinkedList.countIn(in);
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




}
