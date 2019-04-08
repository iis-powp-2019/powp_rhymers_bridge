package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCoutingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.factory.Rhymersfactory;

public class DefaultRhymersFactory implements Rhymersfactory {

	@Override
	public DefaultCoutingOutRhymer getStandardRhymer() {
		return new DefaultCoutingOutRhymer();
	}

	@Override
	public DefaultCoutingOutRhymer getFalseRhymer() {
		return new DefaultCoutingOutRhymer();
	}

	@Override
	public DefaultCoutingOutRhymer getFIFORhymer() {
		return new FIFORhymer();
	}

	@Override
	public DefaultCoutingOutRhymer getHanoiRhymer() {
		return new HanoiRhymer();
	}

}
