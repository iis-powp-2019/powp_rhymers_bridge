package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

	private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

	@Override
	public int countOut() {
		while (!intArrayStack.isEmpty())

			temp.countIn(super.countOut());

		int ret = temp.countOut();

		while (!temp.callCheck())

			intArrayStack.push(temp.countOut());

		return ret;
	}
}