package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;

/**
 * Class to create new instances of various available rhymers.
 */
public class DefaultRhymersFactory implements Rhymersfactory {

    /**
     * Method usable to create new instance of DefaultCountingOutRhymer.
     * returns: new instance of DefaultCountingOutRhymer class.
     */
    @Override
    public DefaultCountingOutRhymer getStandardRhymer() {
        return new DefaultCountingOutRhymer();
    }

    /**
     * Method usable to create new instance of DefaultCountingOutRhymer.
     * returns: new instance of DefaultCountingOutRhymer class.
     */
    @Override
    public DefaultCountingOutRhymer getFalseRhymer() {
        return new DefaultCountingOutRhymer();
    }

    /**
     * Method usable to create new instance of FIFORhymer.
     * returns: new instance of FIFORhymer as object of type DefaultCountingOutRhymer.
     */
    @Override
    public DefaultCountingOutRhymer getFIFORhymer() {
        return new FIFORhymer();
    }

    /**
     * Method usable to create new instance of HanoiRhymer.
     * returns: new instance of HanoiRhymer as object of type DefaultCountingOutRhymer.
     */
    @Override
    public DefaultCountingOutRhymer getHanoiRhymer() {
        return new HanoiRhymer();
    }

}
