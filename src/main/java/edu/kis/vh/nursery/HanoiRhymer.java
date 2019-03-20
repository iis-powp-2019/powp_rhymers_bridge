package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	int rejectedTotalCount = 0;

	public int reportRejected() {
		return rejectedTotalCount;
	}

	public void countIn(int newValue) {
		if (!isEmpty() && newValue > getPeekaboo())
			rejectedTotalCount++;
		else
			super.countIn(newValue);
	}
}

// alt-left and alt-right arrow are used to navigate between previously
// visited places in source code