package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.StackInterface;
import edu.kis.vh.nursery.factory.RhymersFactory;

public class DefaultRhymersFactory implements RhymersFactory {

	@Override
	public StackInterface GetStandardRhymer() {
		return new DefaultCountingOutRhymer();
	}

	@Override
	public StackInterface GetFalseRhymer() {
		return new DefaultCountingOutRhymer();
	}

	@Override
	public StackInterface GetFIFORhymer() {
		return new FIFORhymer();
	}

	@Override
	public StackInterface GetHanoiRhymer() {
		return new HanoiRhymer();
	}

}
