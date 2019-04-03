package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.datastructure.BestInterface;
import edu.kis.vh.nursery.datastructure.IntArrayStack;

public class RhymersFactoryTab implements Rhymersfactory {

    @Override
    final public DefaultCountingOutRhymer GetStandardRhymer() {
        return new DefaultCountingOutRhymer(new IntArrayStack());
    }

    @Override
    final public DefaultCountingOutRhymer GetFalseRhymer() {
        return new DefaultCountingOutRhymer(new IntArrayStack());
    }

    @Override
    final public DefaultCountingOutRhymer GetFIFORhymer() {
        return new FIFORhymer(new IntArrayStack());
    }

    @Override
    final public DefaultCountingOutRhymer GetHanoiRhymer() {
        return new HanoiRhymer(new IntArrayStack());
    }

}
