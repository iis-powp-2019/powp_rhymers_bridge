package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.defaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.factory.Rhymersfactory;

public class DefaultRhymersFactory implements Rhymersfactory {

	@Override
	public DefaultCountingOutRhymer GetStandardRhymer() {
		return new defaultCountingOutRhymer();
	}

	@Override
	public DefaultCountingOutRhymer GetFalseRhymer() {
		return new defaultCountingOutRhymer();
	}

	@Override
	public DefaultCountingOutRhymer GetFIFORhymer() {
		return new FIFORhymer();
	}

	@Override
	public DefaultCountingOutRhymer GetHanoiRhymer() {
		return new HanoiRhymer();
	}

}
