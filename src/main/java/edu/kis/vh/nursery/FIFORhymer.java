package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

	public DefaultCountingOutRhymer temporaryRhymer = new DefaultCountingOutRhymer();

	@Override
	public int countOut() {
		while (!callCheck())
    		temporaryRhymer.countIn(super.countOut());

		int returningValue = temporaryRhymer.countOut();

		while (!temporaryRhymer.callCheck())
    		countIn(temporaryRhymer.countOut());

		return returningValue;
	}
}
