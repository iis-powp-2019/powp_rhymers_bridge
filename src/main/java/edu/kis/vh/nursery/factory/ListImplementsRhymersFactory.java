package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;
import edu.kis.vh.nursery.stack.IntLinkedList;

public class ListImplementsRhymersFactory implements RhymersFactory {

	@Override
	public DefaultCountingOutRhymer getStandardRhymer() {
		return new DefaultCountingOutRhymer(new IntLinkedList());
	}

	@Override
	public DefaultCountingOutRhymer getFalseRhymer() {
		return new DefaultCountingOutRhymer(new IntLinkedList());
	}

	@Override
	public DefaultCountingOutRhymer getFIFORhymer() {
		return new DefaultCountingOutRhymer(new IntLinkedList());
	}

	@Override
	public DefaultCountingOutRhymer getHanoiRhymer() {
		return new DefaultCountingOutRhymer(new IntLinkedList());
	}

}
