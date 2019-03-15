package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

	public DefaultCountingOutRhymer tempDefaultCountingOutRhymer = new DefaultCountingOutRhymer();

	@Override
	public int countOut() {
		while (!callCheck())
			tempDefaultCountingOutRhymer.countIn(super.countOut());

		int returnDefaultCountingOutRhymerCount = tempDefaultCountingOutRhymer.countOut();

		while (!tempDefaultCountingOutRhymer.callCheck())
			countIn(tempDefaultCountingOutRhymer.countOut());

		return returnDefaultCountingOutRhymerCount;
	}
}
