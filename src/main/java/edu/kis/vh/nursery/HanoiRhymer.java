package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	private int totalRejected = 0;

	public HanoiRhymer() {
		super();
	}
	
	public HanoiRhymer(IntStack in) {
		super(in);
	}
	
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

