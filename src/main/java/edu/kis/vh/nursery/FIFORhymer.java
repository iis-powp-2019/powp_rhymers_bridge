package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntStack;

//CTRL-SHIFT-BACKSPACE for going to last edited line
public class FIFORhymer extends DefaultCountingOutRhymer {

	public FIFORhymer(IntStack stack) {
		super(stack);
	}

	public FIFORhymer() {
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
