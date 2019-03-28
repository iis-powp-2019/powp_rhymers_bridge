package edu.kis.vh.nursery;

import edu.kis.vh.nursery.newStackImplementaion.StackInterface;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	private int totalRejected = 0;
	
	public HanoiRhymer() {
		super();
	}

	public HanoiRhymer(StackInterface stackinterface) {
		super(stackinterface);
	}
	
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
