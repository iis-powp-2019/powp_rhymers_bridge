package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.Rhymersfactory;

public class HanoiRhymersFactory implements Rhymersfactory {

    @Override
    public DefaultCountingOutRhymer getStandardRhymer() {
        return new HanoiRhymer();
    }

    @Override
    public DefaultCountingOutRhymer getFalseRhymer() {
        return new FIFORhymer();
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
