package edu.kis.vh.nursery;

import edu.kis.vh.nursery.newStackImplementaion.IntLinkedList;
import edu.kis.vh.nursery.newStackImplementaion.StackInterface;

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

	public FIFORhymer(StackInterface stackInterface) {
		super(stackInterface);
	}
}
// alt + " strzałka " przełączanie kart 
