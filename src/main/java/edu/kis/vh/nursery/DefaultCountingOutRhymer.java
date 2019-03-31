package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.*;

public class DefaultCountingOutRhymer {

    private IntStackInterface intStackInterface;

    public DefaultCountingOutRhymer(IntStackInterface intStackInterface) {
        this.intStackInterface = intStackInterface;
    }

    public DefaultCountingOutRhymer() {
        intStackInterface = new IntLinkedList();
    }

    public void countIn(int in) {
        intStackInterface.push(in);
    }

    boolean callCheck() {
        return intStackInterface.isEmpty();
    }

    boolean isFull() {
        return intStackInterface.isFull();
    }

    int peekaboo() {
        return intStackInterface.top();
    }

    public int countOut() {
        return intStackInterface.pop();
    }
}
