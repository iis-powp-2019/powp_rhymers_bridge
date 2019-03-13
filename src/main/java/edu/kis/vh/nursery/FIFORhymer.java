package edu.kis.vh.nursery;

/**
 * @author Paulina Stelmasiak
 */

public class FIFORhymer extends DefaultCountingOutRhymer {

	private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    /**
     * Metoda DefautlCountingOutRhymer
     * @return temp
     */
	public DefaultCountingOutRhymer getTemp() {
		return temp;
	}

    /**
     * Działanie metody countOut
     * @return ret
     */
	@Override
	public int countOut() {
		while (!callCheck())
			getTemp().countIn(super.countOut());

		final int ret = getTemp().countOut();

		while (!getTemp().callCheck())
			countIn(getTemp().countOut());

		return ret;
	}
}
