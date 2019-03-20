package edu.kis.vh.nursery;

/**
 * @author Szymon
 * Implentacja koljki FIFO
 */
public class FIFORhymer extends DefaultCountingOutRhymer {

	/**
	 * Obiekt kolejki
	 */
	private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

	/**
	 * Metoda zdejmuje elementy kolejki w kolejności FIFO
	 */
	@Override
	public int countOut() {
		while (!callCheck())
			temp.countIn(super.countOut());

		final int ret = temp.countOut();

		while (!temp.callCheck())
			countIn(temp.countOut());

		return ret;
	}
}
