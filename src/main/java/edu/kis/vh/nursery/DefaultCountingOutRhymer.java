package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntArrayStack;
import edu.kis.vh.nursery.list.IntLinkedList;
import edu.kis.vh.nursery.list.IntStackableInterface;

public class DefaultCountingOutRhymer { //All of the tests passed without problem
    //Checked how open Declaration works - it shows where selected method is used.

    private IntStackableInterface intStackableInterface;

    public DefaultCountingOutRhymer(IntArrayStack intArrayStack) {
        this.intStackableInterface = intArrayStack;
    }

    public DefaultCountingOutRhymer(IntLinkedList intLinkedList) {
        this.intStackableInterface = intLinkedList;
    }

    public DefaultCountingOutRhymer() {
        this.intStackableInterface = new IntLinkedList();
    }

    public int getTotal() {
        return intStackableInterface.getTotal();
    }

    public void countIn(int in) {
        intStackableInterface.countIn(in);
    }

    public boolean callCheck() {
        return intStackableInterface.callCheck();
    }

    public boolean isFull() {
        return intStackableInterface.isFull();
    }

    public int peekaboo() {
        return intStackableInterface.peekaboo();
    }

    public int countOut() {
        return intStackableInterface.countOut();
    }
}
