package edu.kis.vh.nursery;

import edu.kis.vh.nursery.container.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {

	public FIFORhymer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FIFORhymer(IntLinkedList linkedList) {
		super(linkedList);
		// TODO Auto-generated constructor stub
	}

	private final StackInterface temp = new DefaultCountingOutRhymer();

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
