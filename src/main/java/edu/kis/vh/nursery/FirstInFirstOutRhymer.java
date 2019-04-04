package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntLinkedList;
import edu.kis.vh.nursery.stack.Stackable;

public class FirstInFirstOutRhymer extends DefaultCountingOutRhymer {

	private Stackable temp = new IntLinkedList();

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
