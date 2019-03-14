package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.defaultCountingOutRhymer;

public interface Rhymersfactory {

    public defaultCountingOutRhymer GetStandardRhymer();

    public defaultCountingOutRhymer GetFalseRhymer();

    public defaultCountingOutRhymer GetFIFORhymer();

    public defaultCountingOutRhymer GetHanoiRhymer();

    // alt + <- go back to earlier modified file and alt + -> work in opposite way
}
