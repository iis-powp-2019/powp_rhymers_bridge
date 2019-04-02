package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.Stackable;
import edu.kis.vh.nursery.stack.IntArrayStack;

public class FirstInFirstOutRhymer extends DefaultCountingOutRhymer {

	public FirstInFirstOutRhymer() {
		super();
	}

	public FirstInFirstOutRhymer(Stackable stack) {
		super(stack);
	}

	private IntArrayStack  temp = new IntArrayStack();

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


//I choose Array, because it is faster than stack