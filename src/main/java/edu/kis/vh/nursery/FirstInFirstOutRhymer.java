package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.Stackable;

public class FirstInFirstOutRhymer extends DefaultCountingOutRhymer {

	private DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

	public FirstInFirstOutRhymer() {
	}

	public FirstInFirstOutRhymer(Stackable stack) {
		super(stack);
	}

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
