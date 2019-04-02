package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.Stackable;

public class FirstInFirstOutRhymer extends DefaultCountingOutRhymer {

	public FirstInFirstOutRhymer() {
		super();
	}

	public FirstInFirstOutRhymer(Stackable stack) {
		super(stack);
	}

	private DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

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
