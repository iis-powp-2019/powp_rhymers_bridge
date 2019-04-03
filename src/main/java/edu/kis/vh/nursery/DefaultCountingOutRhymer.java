package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer {

	//private IntArrayStack stack;
	private IntLinkedList stack;
	
	public void countIn(final int in) {
		stack.countIn(in);
	}

	public DefaultCountingOutRhymer(IntArrayStack stack) {
		super();
		this.stack = stack;
	}

	public DefaultCountingOutRhymer() {
		this.stack = new IntArrayStack();
	}

	public int getTotal() {
		return stack.getTotal();
	}

	boolean callCheck() {
		return stack.callCheck();
	}

	boolean isFull() {
		return stack.isFull();
	}

	int peekaboo() {
		return stack.peekaboo();
	}

	public int countOut() {
		return stack.countOut();
	}

}
