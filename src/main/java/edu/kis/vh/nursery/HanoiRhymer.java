package edu.kis.vh.nursery;

import edu.kis.vh.nursery.storage.IntStorageInterface;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	private int totalRejected = 0;

	public HanoiRhymer(IntStorageInterface intStorage, int totalRejected) {
		super(intStorage);
		this.totalRejected = totalRejected;
	}

	int reportRejected() {
		return getTotalRejected();
	}

	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			setTotalRejected(getTotalRejected() + 1);
		else
			super.countIn(in);
	}

	int getTotalRejected() {
		return totalRejected;
	}

	private void setTotalRejected(int totalRejected) {
		this.totalRejected = totalRejected;
	}
}
