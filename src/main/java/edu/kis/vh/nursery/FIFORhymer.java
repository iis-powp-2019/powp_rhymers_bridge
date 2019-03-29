package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.Stack;
import edu.kis.vh.nursery.stack.IntArrayStack;

public class FIFORhymer extends DefaultCountingOutRhymer {

	public FIFORhymer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FIFORhymer(Stack stack) {
		super(stack);
		// TODO Auto-generated constructor stub
	}
	
	private final Stack temp = new IntArrayStack();

	@Override
	public int countOut() {
		while (!callCheck()) {
			temp.countIn(super.countOut());
		}
		int ret = temp.countOut();
		while (!temp.callCheck()) {
			countIn(temp.countOut());
		}
		return ret;
	}
}
