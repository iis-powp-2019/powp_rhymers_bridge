package edu.kis.vh.nursery;

import edu.kis.vh.nursery.containers.IntLinkedList;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	public HanoiRhymer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HanoiRhymer(IntLinkedList list) {
		super(list);
		// TODO Auto-generated constructor stub
	}

	private static final int NO_REJECTIONS = 0;
	private int totalRejected = NO_REJECTIONS;

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void countIn(final int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}
