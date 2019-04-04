package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collections.IntLinkedList;

/**
 * @author Piotr Sitkowski
 *
 */
public class FIFORhymer extends DefaultCountingOutRhymer {
/**
 * metoda przechodzi przez stos i zwraca pierwszy jego element
 * @return pierwszy element na stosie
 */
	private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();
	
	public FIFORhymer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FIFORhymer(IntLinkedList linkedList) {
		super(linkedList);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int countOut() {
		while (!callCheck())
			temp.countIn(super.countOut());

		int ret = temp.countOut();

		while (!temp.callCheck())
			countIn(temp.countOut());

		return ret;
	}
}
