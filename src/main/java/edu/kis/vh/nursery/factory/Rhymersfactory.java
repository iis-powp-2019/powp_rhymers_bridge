package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.defaultCountingOutRhymer;

public interface Rhymersfactory {

	defaultCountingOutRhymer getStandardRhymer();

	defaultCountingOutRhymer getFalseRhymer();

	defaultCountingOutRhymer getFIFORhymer();

	defaultCountingOutRhymer getHanoiRhymer();

}
