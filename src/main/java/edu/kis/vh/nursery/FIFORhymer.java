package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collections.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {

	private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

	public FIFORhymer(IntLinkedList intArrayStack) {
		super(intArrayStack);
	}

	public FIFORhymer() {
	}

	@Override
	public int countOut() {
		while (!intArrayStack.isEmpty())

			temp.countIn(super.countOut());

		int ret = temp.countOut();

		while (!temp.callCheck())

			intArrayStack.push(temp.countOut());

		return ret;
	}
}