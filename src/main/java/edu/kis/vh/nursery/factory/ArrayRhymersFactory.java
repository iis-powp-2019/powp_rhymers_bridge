package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.stack.IntArrayStack;
import edu.kis.vh.nursery.stack.IntLinkedList;

public class ArrayRhymersFactory implements RhymersFactory {
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
        return new FIFORhymer(new IntArrayStack());
    }

    @Override
    public DefaultCountingOutRhymer getHanoiRhymer() {
        return new HanoiRhymer(new IntArrayStack());
    }
}
