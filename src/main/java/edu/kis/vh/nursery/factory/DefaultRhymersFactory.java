package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.defaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.hanoiRhymer;

public class DefaultRhymersFactory implements Rhymersfactory {

	@Override
	public defaultCountingOutRhymer getStandardRhymer() {
		return new defaultCountingOutRhymer();
	}

	@Override
	public defaultCountingOutRhymer getFalseRhymer() {
		return new defaultCountingOutRhymer();
	}

	@Override
	public defaultCountingOutRhymer getFIFORhymer() {
		return new FIFORhymer();
	}

	@Override
	public defaultCountingOutRhymer getHanoiRhymer() {
		return new hanoiRhymer();
	}

}
