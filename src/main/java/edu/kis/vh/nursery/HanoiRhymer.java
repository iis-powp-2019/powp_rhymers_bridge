package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.Stackable;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	private int totalRejected = 0;

	public HanoiRhymer(Stackable stack) {
		super(stack);
	}

	public HanoiRhymer() {
	}

	protected final int reportRejected() {
		return totalRejected;
	}

	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}
