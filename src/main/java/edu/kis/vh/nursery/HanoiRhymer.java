package edu.kis.vh.nursery;

import edu.kis.vh.nursery.storage.IntArrayStack;
import edu.kis.vh.nursery.storage.IntLinkedList;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	private int totalRejected = 0;

	int reportRejected() {
		return totalRejected;
	}
	
	public HanoiRhymer() {
    }

	public HanoiRhymer(IntLinkedList intLinkedList) {
		super(intLinkedList);
	}

	public HanoiRhymer(IntArrayStack intArrayStack) {
		super(intArrayStack);
	}

	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}
