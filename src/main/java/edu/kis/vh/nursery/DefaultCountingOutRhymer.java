package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

/**
 * DefaultCountingOutRhymer is class, which is base implementation for rhymers.
 *
 * It can count in numbers up to pre-defined value, and count them out in stack-similiar way.
 */
public class DefaultCountingOutRhymer {
    private IntLinkedList intLinkedList;

    public DefaultCountingOutRhymer() {
        this(new IntLinkedList());
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
}
