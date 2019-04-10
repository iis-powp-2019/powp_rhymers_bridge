package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	IntArrayStack stack;

	public DefaultCountingOutRhymer() {
		this.stack = new IntArrayStack();
	}

	public DefaultCountingOutRhymer(IntArrayStack stack) {
		this.stack = stack;
	}

	public void countIn(int in) {
		stack.countIn(in);
	}

	public int countOut() {
		return stack.countOut();
	}

	public boolean callCheck() {
		return stack.callCheck();
	}

	public int peekaboo() {
		return stack.peekaboo();
	}

	public boolean isFull() {
		return stack.isFull();
	}
}
