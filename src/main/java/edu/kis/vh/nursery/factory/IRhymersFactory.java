package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;

/**
 * Factory pattern interface
 */
public interface IRhymersFactory {

    DefaultCountingOutRhymer getStandardRhymer();

    DefaultCountingOutRhymer getFalseRhymer();

    DefaultCountingOutRhymer getFIFORhymer();

    DefaultCountingOutRhymer getHanoiRhymer();

}
