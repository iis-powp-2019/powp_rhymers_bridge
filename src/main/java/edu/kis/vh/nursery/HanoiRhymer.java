package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCoutingOutRhymer {

	int totalRejected = 0;

	protected int reportRejected() {
		return totalRejected;
	}

	protected void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}
