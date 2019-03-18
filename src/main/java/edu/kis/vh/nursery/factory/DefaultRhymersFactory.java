package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FirstInFirstOutRhymer;
import edu.kis.vh.nursery.HanoiRhymer;

public class DefaultRhymersFactory implements RhymersFactory {

	@Override
	public final DefaultCountingOutRhymer GetStandardRhymer() {
		return new DefaultCountingOutRhymer();
	}

	@Override
	public final DefaultCountingOutRhymer GetFalseRhymer() {
		return new DefaultCountingOutRhymer();
	}

	@Override
	public final DefaultCountingOutRhymer GetFIFORhymer() {
		return new FirstInFirstOutRhymer();
	}

	@Override
	public final DefaultCountingOutRhymer GetHanoiRhymer() {
		return new HanoiRhymer();
	}

}
