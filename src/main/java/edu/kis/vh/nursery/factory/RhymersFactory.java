package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;

public interface RhymersFactory {

    static DefaultCountingOutRhymer getStandardRhymer(){
        return new DefaultCountingOutRhymer();
    }

    static DefaultCountingOutRhymer getFalseRhymer(){
        return new DefaultCountingOutRhymer();
    }

    static DefaultCountingOutRhymer getFIFORhymer(){
        return new FIFORhymer();
    }

    static DefaultCountingOutRhymer getHanoiRhymer(){
        return new HanoiRhymer();
    }

}
