package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.StackInterface;

public class FIFORhymer extends DefaultCountingOutRhymer {

	private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

	public FIFORhymer() {
		super();
	}

	public FIFORhymer(StackInterface intLinkedList) {
		super(intLinkedList);
	}

	@Override
	public int countOut() {
		while (!callCheck())
			temp.countIn(super.countOut());

		final int ret = temp.countOut();

		while (!temp.callCheck())
			countIn(temp.countOut());

		return ret;
	}

}
//alt + strzałka w lewo
//cofa się do poprzedniej edycji w projekcie
//alt + strzałka w prawo
//przemieszcza się do następnej edycji w projekcie