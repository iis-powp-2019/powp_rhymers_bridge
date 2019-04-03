package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntArrayStack;
import edu.kis.vh.nursery.stack.Stackable;

/**
 * @author Szymon
 * Implentacja koljki FIFO
 */
public class FIFORhymer extends DefaultCountingOutRhymer {

	public FIFORhymer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FIFORhymer(Stackable stack) {
		super(stack);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Obiekt kolejki
	 */
	private final IntArrayStack temp = new IntArrayStack();

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
