package edu.kis.vh.nursery;

import edu.kis.vh.nursery.intStack.Stackable;
import edu.kis.vh.nursery.list.IntLinkedList;

import java.util.LinkedList;

/**
 * DefaultCountingOutRhymer is counting-out rhyme used to conducting complicated number games
 */
public class DefaultCountingOutRhymer {
    private Stackable stack;

    public DefaultCountingOutRhymer() {
        this.stack = new IntLinkedList();
    }

    public DefaultCountingOutRhymer(Stackable stack) {
        this.stack = stack;
    }

    public void countIn(int in) {
        stack.countIn(in);
    }

    public boolean callCheck() {
        return stack.callCheck();
    }

    public boolean isFull() {
        return stack.isFull();
    }

    public int peekaboo() {
        return stack.peekaboo();
    }

    public int countOut() {
        return stack.countOut();
    }
}
