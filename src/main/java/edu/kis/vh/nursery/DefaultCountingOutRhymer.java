package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

import java.util.LinkedList;

/**
 * DefaultCountingOutRhymer is counting-out rhyme used to conducting complicated number games
 */
public class DefaultCountingOutRhymer {
    private IntLinkedList intlinkedList;

    public DefaultCountingOutRhymer() {
        this.intlinkedList = new IntLinkedList();
    }

    public DefaultCountingOutRhymer(IntLinkedList intlinkedList) {
        this.intlinkedList = intlinkedList;
    }

    public void countIn(int in) {
        intlinkedList.push(in);
    }

    public boolean callCheck() {
        return intlinkedList.isEmpty();
    }

    public boolean isFull() {
        return intlinkedList.isFull();
    }

    public int peekaboo() {
        return intlinkedList.top();
    }

    public int countOut() {
        return intlinkedList.pop();
    }
}
