package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntArrayStack;
import edu.kis.vh.nursery.stack.IntStack;
import edu.kis.vh.nursery.stack.list.IntLinkedList;

//CTRL-SHIFT-BACKSPACE for going to last edited line
public class FIFORhymer extends DefaultCountingOutRhymer {

	public FIFORhymer(IntStack stack) {
		super(stack);
	}

	public FIFORhymer() {
	}

	private final IntArrayStack temp = new IntArrayStack();

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
