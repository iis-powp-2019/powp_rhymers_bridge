package edu.kis.vh.nursery.factory;

//inteface RhymersFactory
import edu.kis.vh.nursery.DefaultCountingOutRhymer;

public interface RhymersFactory {

    public DefaultCountingOutRhymer getStandardRhymer();

    public DefaultCountingOutRhymer getFalseRhymer();

    public DefaultCountingOutRhymer getFIFORhymer();

    public DefaultCountingOutRhymer getHanoiRhymer();

}
