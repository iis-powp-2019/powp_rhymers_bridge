package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

	private DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
	
	@Override
	int countOut() {
		while (!isEmpty())
			rhymer.countIn(super.countOut());
		
		int valueToReturn = rhymer.countOut();
		
		while (!rhymer.isEmpty())
			countIn(rhymer.countOut());
		
		return valueToReturn;
	}
}
