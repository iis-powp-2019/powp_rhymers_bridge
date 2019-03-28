package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collections.IntLinkedList;

/**
 * @author Maciek Implementing a stack of integers with pointer on last added element.
 */
public class DefaultCountingOutRhymer {

    private Collections intLinkedList;

    public DefaultCountingOutRhymer(Collections intLinkedList) {
        super();
        this.intLinkedList = intLinkedList;
    }

    public DefaultCountingOutRhymer() {
        this.intLinkedList = new IntLinkedList();
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

    public int countOut() {
        return intLinkedList.countOut();
    }

    public int getTotal() {
        return intLinkedList.getTotal();
    }

    public int peekaboo() {
        return intLinkedList.peekaboo();
    }

}
