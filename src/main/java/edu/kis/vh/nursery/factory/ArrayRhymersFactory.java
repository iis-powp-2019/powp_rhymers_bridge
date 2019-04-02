package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.ownStackImplementations.IntArrayStack;
import edu.kis.vh.nursery.ownStackImplementations.IntLinkedList;

public class ArrayRhymersFactory implements IRhymersFactory {

    @Override
    public DefaultCountingOutRhymer getStandardRhymer() {
        return new DefaultCountingOutRhymer(new IntArrayStack());
    }

    @Override
    public DefaultCountingOutRhymer getFalseRhymer() {
        return new DefaultCountingOutRhymer(new IntLinkedList());
    }

    @Override
    public DefaultCountingOutRhymer getFIFORhymer() {
        return new DefaultCountingOutRhymer(new IntArrayStack());
    }

    @Override
    public DefaultCountingOutRhymer getHanoiRhymer() {
        return new DefaultCountingOutRhymer(new IntArrayStack());
    }
}
