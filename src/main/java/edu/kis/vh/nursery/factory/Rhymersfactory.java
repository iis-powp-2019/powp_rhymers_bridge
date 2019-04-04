package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCoutingOutRhymer;

public interface Rhymersfactory {

	public DefaultCoutingOutRhymer GetStandardRhymer();

	public DefaultCoutingOutRhymer GetFalseRhymer();

	public DefaultCoutingOutRhymer GetFIFORhymer();

	public DefaultCoutingOutRhymer GetHanoiRhymer();

}
