package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FifoRhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.containers.IntArrayStack;
import edu.kis.vh.nursery.containers.IntLinkedList;

public class StosRhymersFactory implements RhymersFactory {

	@Override
	public DefaultCountingOutRhymer getStandardRhymer() {
		return new DefaultCountingOutRhymer(new IntArrayStack());
	}

	@Override
	public DefaultCountingOutRhymer getFalseRhymer() {
		return new DefaultCountingOutRhymer(new IntLinkedList());
	}

	@Override
	public DefaultCountingOutRhymer getFifoRhymer() {
		return new FifoRhymer(new IntArrayStack(), new IntArrayStack());
	}

	@Override
	public DefaultCountingOutRhymer getHanoiRhymer() {
		return new HanoiRhymer(new IntArrayStack());
	}

}
