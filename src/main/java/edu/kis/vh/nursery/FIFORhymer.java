package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stacks.IIntStack;
import edu.kis.vh.nursery.stacks.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {

	private DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

	public FIFORhymer(IIntStack iIntStack) {
		super(iIntStack);
	}

	public FIFORhymer() {
		super();
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
//Kombinacje tych klawiszy przelaczaja otwarte karty plików