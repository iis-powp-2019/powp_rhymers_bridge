package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntArrayStack;
import edu.kis.vh.nursery.stack.IntLinkedList;
import edu.kis.vh.nursery.stack.Stackable;

public class FirstInFirstOutRhymer extends DefaultCountingOutRhymer {

	private final Stackable temp = new IntArrayStack();

	public FirstInFirstOutRhymer(Stackable stack) {
		super(stack);
	}

	public FirstInFirstOutRhymer() {
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
//Kombinacja ctrl+alt+ strzałka w lewo sprawia, że przechodzimy wstecz po histori aktualnie otwartych kart, z kolei ctrl + alt + strzałka w prawo idzie do przodu w kolejości otwartych kart.

//IntArrayStack jest szybszy od IntLinkedList.