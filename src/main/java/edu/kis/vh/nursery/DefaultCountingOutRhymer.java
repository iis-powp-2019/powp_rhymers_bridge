package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntArrayStack;

public class DefaultCountingOutRhymer {

	private IntArrayStack intArrayStack;

	public DefaultCountingOutRhymer() {
		intArrayStack = new IntArrayStack();
	}

	public DefaultCountingOutRhymer(IntArrayStack intArrayStack) {
		this.intArrayStack = intArrayStack;
	}

	public int getTotal() {
		return intArrayStack.getTotal();
	}

	public void countIn(int in) {
		intArrayStack.countIn(in);
	}

	public int countOut() {
		return intArrayStack.countOut();
	}

	boolean callCheck() {
		return intArrayStack.callCheck();
	}

	boolean isFull() {
		return intArrayStack.isFull();
	}

	int peekaboo() {
		return intArrayStack.peekaboo();
	}
}
