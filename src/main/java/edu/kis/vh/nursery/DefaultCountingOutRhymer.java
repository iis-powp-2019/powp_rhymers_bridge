package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

/**
 * @author Maciek Implementing a stack of integers with pointer on last added element.
 */
public class DefaultCountingOutRhymer {

    private IntLinkedList intLinkedList;

    public DefaultCountingOutRhymer(IntLinkedList intLinkedList) {
        super();
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
        return intLinkedList.isFull();
    }

    public int countOut() {
        return intLinkedList.pop();
        // return intArrayStack.countOut();
    }

    public int getTotal() {
        return intLinkedList.getTotal();
    }

    public int peekaboo() {
        return intLinkedList.top();
    }

}
