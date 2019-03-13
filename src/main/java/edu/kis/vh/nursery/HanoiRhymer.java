package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	int totalRejected = 0;

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
// 3.1.3 kombinacje klawiszy alt + (strzałka w lewo) oraz alt + (strzałka w
// prawo ) przemieszcza nas po ostatnio otwartych kartach