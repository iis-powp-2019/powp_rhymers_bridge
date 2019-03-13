package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

	private DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

	public DefaultCountingOutRhymer getTemp() {
		return temp;
	}

	@Override
	public int countOut() {
		while (!callCheck())
			getTemp().countIn(super.countOut());

		int ret = getTemp().countOut();

		while (!getTemp().callCheck())
			countIn(getTemp().countOut());

		return ret;
	}
}
