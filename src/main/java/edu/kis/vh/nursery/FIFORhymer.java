package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {

	private final IntLinkedList temp = new IntLinkedList();
	//Wybralem IntLinkedList poniewaz jest bardziej optymalny dla FIFORhymers
	@Override
	public int countOut() {
		while (!callCheck())
			temp.countIn(super.countOut());

		final int ret = temp.countOut();

		while (!temp.callCheck())

			countIn(temp.countOut());

		return ret;
	}

	public FIFORhymer() {
		super();
	}

	public FIFORhymer(IStack stack) {
		super(stack);

	}
}
