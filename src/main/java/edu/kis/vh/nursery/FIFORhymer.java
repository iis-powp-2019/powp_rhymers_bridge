package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntArrayStack;
import edu.kis.vh.nursery.stack.StackInterface;

public class FIFORhymer extends DefaultCountingOutRhymer {
	
	public FIFORhymer() {
		super();
	}

	//private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();
	private final StackInterface temp = new IntArrayStack();

	@Override
	public int countOut() {
		while (!callCheck())
			temp.push(super.countOut());

		int ret = temp.pop();

		while (!temp.isEmpty())
			countIn(temp.pop());

		return ret;
	}
}