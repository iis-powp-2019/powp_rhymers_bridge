package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntStack;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	private static final int REJECTED_AT_START = 0;
	private int totalRejected = REJECTED_AT_START;

	public int reportRejected() {
		return totalRejected;
	}

	public HanoiRhymer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HanoiRhymer(IntStack stack) {
		super(stack);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}
