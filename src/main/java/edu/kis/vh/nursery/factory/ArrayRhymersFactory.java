package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;

public class ArrayRhymersFactory implements RhymersFactory {


    @Override
    public DefaultCountingOutRhymer getStandardRhymer() {
        return new FIFORhymer();
    }

    @Override
    public DefaultCountingOutRhymer getFalseRhymer() {
        return new HanoiRhymer();
    }

    @Override
    public DefaultCountingOutRhymer getFIFORhymer() {
        return new FIFORhymer();
    }

    @Override
    public DefaultCountingOutRhymer getHanoiRhymer() {
        return new HanoiRhymer();
    }
}
