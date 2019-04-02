package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.Rhymersfactory;

public class FIFORhymerFactory implements Rhymersfactory {

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
