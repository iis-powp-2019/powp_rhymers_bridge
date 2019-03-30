package edu.kis.vh.nursery;

import edu.kis.vh.nursery.storage.IntArrayStack;
import edu.kis.vh.nursery.storage.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {

	private final IntLinkedList temp = new IntLinkedList();

	@Override
	public int countOut() {
		while (!callCheck())

			temp.push(super.countOut());

		int ret = temp.pop();

		while (!temp.isEmpty())

			countIn(temp.pop());

		return ret;
	}
	
	public FIFORhymer() {
    }

	public FIFORhymer(IntLinkedList intLinkedList) {
		super(intLinkedList);
	}

	public FIFORhymer(IntArrayStack intArrayStack) {
		super(intArrayStack);
	}
}
