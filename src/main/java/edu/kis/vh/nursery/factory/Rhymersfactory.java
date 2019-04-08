package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCoutingOutRhymer;

public interface Rhymersfactory {

	public DefaultCoutingOutRhymer getStandardRhymer();

	public DefaultCoutingOutRhymer getFalseRhymer();

	public DefaultCoutingOutRhymer getFIFORhymer();

	public DefaultCoutingOutRhymer getHanoiRhymer();

}
