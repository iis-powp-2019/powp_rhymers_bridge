package edu.kis.vh.nursery;

import edu.kis.vh.nursery.newStackImplementaion.IntLinkedList;

public class FIFORhymer extends DefaultCountingOutRhymer {

	private IntLinkedList temp = new IntLinkedList();

	@Override
	public int countOut() {
		while (!callCheck())

			temp.countIn(super.countOut());

		int ret = temp.countOut();

		while (!temp.callCheck())

			countIn(temp.countOut());

		return ret;
	}

	public FIFORhymer() {
		super();
	}

	public FIFORhymer(IntLinkedList linkedList) {
		super(linkedList);
	}
}
// alt + " strzałka " przełączanie kart 
