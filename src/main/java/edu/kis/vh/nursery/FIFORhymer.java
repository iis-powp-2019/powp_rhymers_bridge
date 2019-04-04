package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collections.IntArrayStack;
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
	private final StackInterface temp = new IntLinkedList();
	
	public FIFORhymer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FIFORhymer(IntLinkedList linkedList) {
		super(linkedList);
		// TODO Auto-generated constructor stub
	}

	public FIFORhymer(IntArrayStack intArrayStack) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int countOut() {
		while (!callCheck())
			temp.push(super.countOut());

		int ret = temp.pop();

		while (!temp.isEmpty())
			countIn(temp.pop());

		return ret;
	}
}
