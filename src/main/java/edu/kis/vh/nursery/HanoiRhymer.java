package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.StackCollection;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	private int rejectedTotalCount = 0;

	public HanoiRhymer() {
	}

	public HanoiRhymer(StackCollection collection) {
		super(collection);
	}

	int reportRejected() {
		return rejectedTotalCount;
	}

	@Override
	public void countIn(int newValue) {
		if (!isEmpty() && newValue > getPeekaboo())
			rejectedTotalCount++;
		else
			super.countIn(newValue);
	}
}

// alt-left and alt-right arrow are used to navigate between previously
// visited places in source code