package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;

/**
 * Factory pattern class
 */
public final class DefaultRhymersFactory implements IRhymersFactory {

    /**
     * @return return default rhymer
     */
    @Override
    public DefaultCountingOutRhymer getStandardRhymer() {
        return new DefaultCountingOutRhymer();
    }

    /**
     * @return return false default rhymer
     */
    @Override
    public DefaultCountingOutRhymer getFalseRhymer() {
        return new DefaultCountingOutRhymer();
    }

    /**
     * @return return FIFO rhymer
     */
    @Override
    public DefaultCountingOutRhymer getFIFORhymer() {
        return new FIFORhymer();
    }

    /**
     * @return return Hanoi rhymer
     */
    @Override
    public DefaultCountingOutRhymer getHanoiRhymer() {
        return new HanoiRhymer();
    }

}
