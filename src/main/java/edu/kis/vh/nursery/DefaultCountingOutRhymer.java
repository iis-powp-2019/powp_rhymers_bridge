package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntLinkedList;
import edu.kis.vh.nursery.stack.Stackable;

public class DefaultCountingOutRhymer {

	private Stackable stack;

	public DefaultCountingOutRhymer(Stackable stack) {
		this.stack = stack;
	}

	public DefaultCountingOutRhymer() {
		this.stack = new IntLinkedList();
	}

	public int getTotal() {
		return stack.getTotal();
	}

	public void countIn(int in) {
        stack.countIn(in);
	}

	public boolean callCheck() {
		return stack.callCheck();
	}

	public boolean isFull() {
		return stack.isFull();
	}

	public int peekaboo() {
		return stack.peekaboo();
	}

	public int countOut() {
		return stack.countOut();
	}
}
