package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.DefaultCountingOutRhymer;

public class DefaultRhymersFactory implements IRhymersFactory {

    @Override public DefaultCountingOutRhymer getStandardRhymer() {
        return new DefaultCountingOutRhymer();
    }

    @Override public DefaultCountingOutRhymer getFalseRhymer() {
        return new DefaultCountingOutRhymer();
    }

    @Override public DefaultCountingOutRhymer getFIFORhymer() {
        return new FIFORhymer();
    }

    @Override public DefaultCountingOutRhymer getHanoiRhymer() {
        return new HanoiRhymer();
    }

}
