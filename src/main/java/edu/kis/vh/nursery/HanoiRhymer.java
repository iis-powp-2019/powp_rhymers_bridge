package edu.kis.vh.nursery;

import edu.kis.vh.nursery.newStackImplementaion.StackInterface;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	public HanoiRhymer() {
		super();
	}

	public HanoiRhymer(StackInterface stackinterface) {
		super(stackinterface);
	}

	private int totalRejected = 0;
	
	protected int reportRejected() {
		return totalRejected;
	}
	
	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
	
	int getTotalRejected() {
		return totalRejected;
	}
}
