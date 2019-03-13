package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

	private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

	@Override
	public int countOut() {
		while (!callCheck())
			getTemp().countIn(super.countOut());

		final int ret = getTemp().countOut();

		while (!getTemp().callCheck())
			countIn(getTemp().countOut());

		return ret;
	}

	public DefaultCountingOutRhymer getTemp() {
		return temp;
	}

}
//alt + strzałka w lewo
//cofa się do poprzedniej edycji w projekcie
//alt + strzałka w prawo
//przemieszcza się do następnej edycji w projekcie