package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collections.IntLinkedList;
import edu.kis.vh.nursery.collections.Stack;

public class FIFORhymer extends DefaultCountingOutRhymer {

	private final Stack temp = new IntLinkedList();
	//Wybrałem linked list, bo możemy ją dowolnie rozszerzać
	public FIFORhymer(IntLinkedList intArrayStack) {
		super(intArrayStack);
	}

	public FIFORhymer() {
	}

	@Override
	public int countOut() {
		while (!intArrayStack.isEmpty())

			temp.push(super.countOut());

		int ret = temp.pop();

		while (!temp.isEmpty())

			intArrayStack.push(temp.pop());

		return ret;
	}
}