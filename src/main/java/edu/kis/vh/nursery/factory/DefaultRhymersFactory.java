package edu.kis.vh.nursery.factory;

/**
 * DefaultRhymersFactory is a class which contain four methods for DefaultCountingOutRhymer class
 */

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;

public class DefaultRhymersFactory implements RhymersFactory {

    /**
     *
     * @return new DefaultCountingOutRhymer for StandardRhymer
     */
    @Override
    public DefaultCountingOutRhymer getStandardRhymer() {
        return new DefaultCountingOutRhymer(new IntArrayStack());
    }

    /**
     *
     * @return new DefaultCountingOutRhymer for FalseRhymer
     */
    @Override
    public DefaultCountingOutRhymer getFalseRhymer() {
        return new DefaultCountingOutRhymer(new IntArrayStack());
    }

    /**
     *
     * @return new FIFORhymer
     */
    @Override
    public DefaultCountingOutRhymer getFIFORhymer() {
        return new FIFORhymer();
    }

    /**
     *
     * @return new HanoiRhymer
     */
    @Override
    public HanoiRhymer getHanoiRhymer() {
        return new HanoiRhymer();
    }

}
