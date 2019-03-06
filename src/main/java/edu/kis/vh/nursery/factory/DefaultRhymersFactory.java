package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCoutingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.factory.Rhymersfactory;

public class DefaultRhymersFactory implements Rhymersfactory {

	@Override
	public DefaultCoutingOutRhymer GetStandardRhymer() {
		return new DefaultCoutingOutRhymer();
	}

	@Override
	public DefaultCoutingOutRhymer GetFalseRhymer() {
		return new DefaultCoutingOutRhymer();
	}

	@Override
	public DefaultCoutingOutRhymer GetFIFORhymer() {
		return new FIFORhymer();
	}

	@Override
	public DefaultCoutingOutRhymer GetHanoiRhymer() {
		return new HanoiRhymer();
	}

}
