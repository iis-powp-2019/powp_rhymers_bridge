package edu.kis.vh.nursery;

import edu.kis.vh.nursery.newStackImplementaion.IntLinkedList;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	public HanoiRhymer() {
		super();
	}

	public HanoiRhymer(IntLinkedList linkedList) {
		super(linkedList);
	}

	private int totalRejected = 0;
	
	protected int reportRejected() {
		return totalRejected;
	}
	
	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
	
	int getTotalRejected() {
		return totalRejected;
	}
}
