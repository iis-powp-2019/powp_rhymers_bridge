package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.StackCollection;

public class FIFORhymer extends DefaultCountingOutRhymer {

	private final DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

	public FIFORhymer() {
	}

	public FIFORhymer(StackCollection collection) {
		super(collection);
	}

	@Override
	public int countOut() {
		while (!isEmpty())
			rhymer.countIn(super.countOut());
		
		int valueToReturn = rhymer.countOut();
		
		while (!rhymer.isEmpty())
			countIn(rhymer.countOut());
		
		return valueToReturn;
	}
}
