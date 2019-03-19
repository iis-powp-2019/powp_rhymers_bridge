package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {
	private static final int DEFAULT_VALUE = 0;
	private int totalRejected = DEFAULT_VALUE;

	public int reportRejected() {
		return totalRejected;
	}

	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}