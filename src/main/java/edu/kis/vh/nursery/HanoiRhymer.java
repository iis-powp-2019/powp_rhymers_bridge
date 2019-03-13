package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	private static final int ZERO = 0;
	private int totalRejected = ZERO;

	protected int reportRejected() {
		return getTotalRejected();
	}

	@Override
	protected void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			setTotalRejected(getTotalRejected() + 1);
		else
			super.countIn(in);
	}

	int getTotalRejected() {
		return totalRejected;
	}

	void setTotalRejected(int totalRejected) {
		this.totalRejected = totalRejected;
	}
}
