package edu.kis.vh.nursery;

public class hanoiRhymer extends defaultCountingOutRhymer {

	private int totalRejected = 0;

	int reportRejected() {
		return totalRejected;
	}

	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}
