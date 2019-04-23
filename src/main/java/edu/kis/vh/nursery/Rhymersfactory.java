package edu.kis.vh.nursery;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;

 public interface Rhymersfactory {

    public DefaultCountingOutRhymer getStandardRhymer();

    public DefaultCountingOutRhymer getFalseRhymer();

    public DefaultCountingOutRhymer getFIFORhymer();

    public DefaultCountingOutRhymer getHanoiRhymer();

}
