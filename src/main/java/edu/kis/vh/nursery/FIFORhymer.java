package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntArrayStack;
import edu.kis.vh.nursery.stack.Interface;

/**
 * @author Paulina Stelmasiak
 */

public class FIFORhymer extends DefaultCountingOutRhymer {

	private Interface temp = new IntArrayStack();

	public FIFORhymer(Interface intLinkedList) {
		super(intLinkedList);
	}

	public FIFORhymer() {
		super();
	}

	/**
     * Metoda DefautlCountingOutRhymer
     * @return temp
     */
	public Interface getTemp() {
		return temp;
	}

    /**
     * Działanie metody countOut
     * @return ret
     */
	@Override
	public int countOut() {
		while (!callCheck())
			getTemp().push(super.countOut());

		final int ret = getTemp().pop();

		while (!getTemp().isEmpty())
			countIn(getTemp().pop());

		return ret;
	}
}
