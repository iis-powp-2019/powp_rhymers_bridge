package edu.kis.vh.nursery.factory;

//inteface RhymersFactory
import edu.kis.vh.nursery.DefaultCountingOutRhymer;

public interface RhymersFactory {

    public DefaultCountingOutRhymer GetStandardRhymer();

    public DefaultCountingOutRhymer GetFalseRhymer();

    public DefaultCountingOutRhymer GetFIFORhymer();

    public DefaultCountingOutRhymer GetHanoiRhymer();

}
