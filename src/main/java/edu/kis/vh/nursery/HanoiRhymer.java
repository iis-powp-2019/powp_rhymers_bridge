package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	private int rejectedTotalCount = 0;

	int reportRejected() {
		return rejectedTotalCount;
	}

	void countIn(int newValue) {
		if (!isEmpty() && newValue > getPeekaboo())
			rejectedTotalCount++;
		else
			super.countIn(newValue);
	}
}

// alt-left and alt-right arrow are used to navigate between previously
// visited places in source code