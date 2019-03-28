package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
	private IntArrayStack stack;

	public DefaultCountingOutRhymer() {
		stack = new IntArrayStack();
	}

	public DefaultCountingOutRhymer(IntArrayStack stack) {
		this.stack = stack;
	}

	public void countIn(int newValue) {
		stack.countIn(newValue);
	}

	public boolean isEmpty() {
		return stack.isEmpty();
	}

	public boolean isFull() {
		return stack.isFull();
	}

	public int getPeekaboo() {
		return stack.getPeekaboo();
	}

	public int countOut() {
		return stack.countOut();
	}
}
