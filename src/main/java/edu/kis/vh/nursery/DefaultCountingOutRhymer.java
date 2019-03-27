package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

/**
 * DefaultCountingOutRhymer is class, which is base implementation for rhymers.
 *
 * It can count in numbers up to pre-defined value, and count them out in stack-similiar way.
 */
public class DefaultCountingOutRhymer {
    private Rhymer rhymer;

    public DefaultCountingOutRhymer() {
        this(new IntLinkedList());
    }

    public DefaultCountingOutRhymer(Rhymer rhymer) {
        this.rhymer = rhymer;
    }

    public void countIn(int in) {
        rhymer.countIn(in);
    }

    public boolean callCheck() {
        return rhymer.callCheck();
    }

    public boolean isFull() {
        return rhymer.isFull();
    }

    public int peekaboo() {
        return rhymer.peekaboo();
    }

    public int countOut() {
        return rhymer.countOut();
    }
}
