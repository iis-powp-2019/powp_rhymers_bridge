package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntArrayStackInterface;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	public HanoiRhymer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HanoiRhymer(IntArrayStackInterface stack) {
		super(stack);
		// TODO Auto-generated constructor stub
	}

	private int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	public void countIn(int in) {
	if (!callCheck() && in > peeKaBoo())
		totalRejected++;
		else
			super.countIn(in);
	}
}
