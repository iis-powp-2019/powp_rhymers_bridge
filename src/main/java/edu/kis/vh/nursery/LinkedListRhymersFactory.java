package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.Rhymersfactory;
import edu.kis.vh.nursery.stacks.IntArrayStack;
import edu.kis.vh.nursery.stacks.IntLinkedList;

public class LinkedListRhymersFactory implements Rhymersfactory {
    @Override
    public DefaultCountingOutRhymer getStandardRhymer() {
        return new DefaultCountingOutRhymer(new IntLinkedList());
    }

    @Override
    public DefaultCountingOutRhymer getFalseRhymer() {
        return new DefaultCountingOutRhymer(new IntArrayStack());
    }

    @Override
    public DefaultCountingOutRhymer getFIFORhymer() {
        return new FIFORhymer(new IntLinkedList());
    }

    @Override
    public DefaultCountingOutRhymer getHanoiRhymer() {
        return new HanoiRhymer(new IntLinkedList());
    }
}
