package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntArrayStack;
import edu.kis.vh.nursery.stack.StackInterface;

public class FIFORhymer extends DefaultCountingOutRhymer {

	private StackInterface temp = new IntArrayStack();

	public FIFORhymer() {
		super();
	}

	public FIFORhymer(StackInterface intLinkedList) {
		super(intLinkedList);
	}

	@Override
	public int countOut() {
		while (!callCheck())
			temp.push(super.countOut());

		final int ret = temp.pop();

		while (!temp.isEmpty())
			countIn(temp.pop());

		return ret;
	}

}
//alt + strzałka w lewo
//cofa się do poprzedniej edycji w projekcie
//alt + strzałka w prawo
//przemieszcza się do następnej edycji w projekcie