package edu.kis.vh.nursery;

import edu.kis.vh.nursery.containers.IntArrayStack;
import edu.kis.vh.nursery.containers.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {

	private final IntArrayStack temp = new IntArrayStack();
	
	public FIFORhymer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FIFORhymer(IntLinkedList list) {
		super(list);
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
