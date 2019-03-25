package edu.kis.vh.nursery;

import edu.kis.vh.nursery.OwnStackImplementation.IntLinkedList;

/**
 * class of own queue impl
 */
public class DefaultCountingOutRhymer {

    private IntStack intStack;

    public DefaultCountingOutRhymer(IntStack intStack) {
        this.intStack = intStack;
    }

    public DefaultCountingOutRhymer() {
        intStack = new IntLinkedList();
    }

    public void countIn(int in) {
        intStack.countIn(in);
    }

    public boolean callCheck() {
        return intStack.callCheck();
    }

    public boolean isFull() {
        return intStack.isFull();
    }

    public int peekaboo() {
        return intStack.peekaboo();
    }

    public int countOut() {
        return intStack.countOut();
    }
}
