package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.defaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.hanoiRhymer;

public class DefaultRhymersFactory implements Rhymersfactory {

	@Override
	public final defaultCountingOutRhymer getStandardRhymer() {
		return new defaultCountingOutRhymer();
	}

	@Override
	public final defaultCountingOutRhymer getFalseRhymer() {
		return new defaultCountingOutRhymer();
	}

	@Override
	public final defaultCountingOutRhymer getFIFORhymer() {
		return new FIFORhymer();
	}

	@Override
	public final defaultCountingOutRhymer getHanoiRhymer() {
		return new hanoiRhymer();
	}

}
