package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;

public class DefaultRhymersFactory implements Rhymersfactory {

	@Override
	public final DefaultCountingOutRhymer getStandardRhymer() {
		return new DefaultCountingOutRhymer();
	}

	@Override
	public final DefaultCountingOutRhymer getFalseRhymer() {
		return new DefaultCountingOutRhymer();
	}

	@Override
	public final DefaultCountingOutRhymer getFIFORhymer() {
		return new FIFORhymer();
	}

	@Override
	public final DefaultCountingOutRhymer getHanoiRhymer() {
		return new HanoiRhymer();
	}

}
