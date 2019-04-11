package edu.kis.vh.nursery;

import edu.kis.vh.nursery.container.IntArrayStack;
import edu.kis.vh.nursery.container.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {

	private final IntArrayStack temp = new IntArrayStack();

	public FIFORhymer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FIFORhymer(StackInterface stack) {
		super(stack);
		// TODO Auto-generated constructor stub
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
