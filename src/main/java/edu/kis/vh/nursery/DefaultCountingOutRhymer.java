package edu.kis.vh.nursery;

import edu.kis.vh.nursery.datastructure.BestInterface;
import edu.kis.vh.nursery.datastructure.IntLinkedList;

public class DefaultCountingOutRhymer {

    private BestInterface intLinkedList = new IntLinkedList();


    public DefaultCountingOutRhymer(){};

    public DefaultCountingOutRhymer(BestInterface intLinkedList) {
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
