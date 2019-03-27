package edu.kis.vh.nursery;

import edu.kis.vh.nursery.datastructures.*;

public class DefaultCountingOutRhymer {

    private IIntLinkedList intLinkedList;

    public DefaultCountingOutRhymer(){
        this(new IntLinkedList());
    }

    public DefaultCountingOutRhymer(IIntLinkedList intLinkedList) {
        this.intLinkedList = intLinkedList;
    }

//    public int getTotal() {
//        return intLinkedList.getTotal();
//    }

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
}
