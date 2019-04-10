package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.collection.IntArrayStack;
import edu.kis.vh.nursery.collection.IntLinkedList;

public class DefaultRhymersFactory implements RhymersFactory {

	@Override
	public final DefaultCountingOutRhymer getStandardRhymer() {
		return new DefaultCountingOutRhymer(new IntLinkedList());
	}

	@Override
	public final DefaultCountingOutRhymer getFalseRhymer() {
		return new DefaultCountingOutRhymer(new IntLinkedList());
	}

	@Override
	public final DefaultCountingOutRhymer getFIFORhymer() {
		return new FIFORhymer(new IntArrayStack());
	}

	@Override
	public final DefaultCountingOutRhymer getHanoiRhymer() {
		return new HanoiRhymer();
	}

}
