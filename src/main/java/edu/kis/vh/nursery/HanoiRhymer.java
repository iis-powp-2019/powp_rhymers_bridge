package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	public HanoiRhymer(IntArrayStack a) {
		super (a);
	}
	
	private int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekAboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}

