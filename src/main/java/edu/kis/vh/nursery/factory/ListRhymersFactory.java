package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.stacks.IntArrayStack;
import edu.kis.vh.nursery.stacks.LinkedListOfIntegers;

public class ListRhymersFactory implements RhymersFactory {

    @Override public DefaultCountingOutRhymer getStandardRhymer() {
        return new DefaultCountingOutRhymer(new LinkedListOfIntegers());
    }

    @Override public DefaultCountingOutRhymer getFalseRhymer() {
        return new DefaultCountingOutRhymer(new IntArrayStack());
    }

    @Override public DefaultCountingOutRhymer getFIFORhymer() {
        return new FIFORhymer(new LinkedListOfIntegers());
    }

    @Override public DefaultCountingOutRhymer getHanoiRhymer() {
        return new HanoiRhymer(new LinkedListOfIntegers());
    }
}
