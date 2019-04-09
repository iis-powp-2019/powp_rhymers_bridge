package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {

	private final Stack temp = new IntLinkedList();

	public FIFORhymer(IntLinkedList list) {
		super(list);
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
// skroty alt + strzałka pozwalaja na przesuwanie sie pomiedzy kartami