package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	public void countIn(final int input) {
    	if (!callCheck() && input > peekaboo())
			totalRejected++;
    	else
    	    super.countIn(input);
	}
}
