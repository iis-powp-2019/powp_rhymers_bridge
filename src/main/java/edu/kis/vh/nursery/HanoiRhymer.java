package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.Stackable;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	public HanoiRhymer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HanoiRhymer(Stackable stack) {
		super(stack);
		// TODO Auto-generated constructor stub
	}

	private int totalRejected = 0;

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
