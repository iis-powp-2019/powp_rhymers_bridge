package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.StackInterface;

public class FIFORhymer extends DefaultCountingOutRhymer {
	
	public FIFORhymer() {
		super();
	}

	public FIFORhymer(StackInterface intLinkedList) {
		super(intLinkedList);
	}

	private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

	@Override
	public int countOut() {
		while (!callCheck())
			temp.countIn(super.countOut());

		int ret = temp.countOut();

		while (!temp.callCheck())
			countIn(temp.countOut());

		return ret;
	}
}