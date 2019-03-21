package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import edu.kis.vh.nursery.list.IntStackInterface;

public class DefaultCountingOutRhymer {

    private IntStackInterface intStackInterface = new IntLinkedList();

    public DefaultCountingOutRhymer(IntLinkedList intStackInterface) {
        this.intStackInterface = intStackInterface;
    }

    public DefaultCountingOutRhymer(){

    }

    public void countIn(int in) {
        intStackInterface.push(in);
    }

    public int countOut() {
        return intStackInterface.pop();
    }

    public boolean callCheck() {
        return intStackInterface.isEmpty();
    }

    public boolean isFull() {
        return intStackInterface.isFull();
    }

    public int peekaboo() {
        return intStackInterface.top();
    }
}
