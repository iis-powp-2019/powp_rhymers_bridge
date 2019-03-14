package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.defaultCountingOutRhymer;

public interface Rhymersfactory {

	public defaultCountingOutRhymer getStandardRhymer();

	public defaultCountingOutRhymer getFalseRhymer();

	public defaultCountingOutRhymer getFIFORhymer();

	public defaultCountingOutRhymer getHanoiRhymer();

}
