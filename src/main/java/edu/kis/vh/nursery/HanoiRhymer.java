package edu.kis.vh.nursery;

import edu.kis.vh.nursery.Containers.StackInterface;

public class HanoiRhymer extends DefaultCoutingOutRhymer {

	public HanoiRhymer(){}
	HanoiRhymer(StackInterface stack) {
		super(stack);
	}

	int totalRejected = 0;

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
}
