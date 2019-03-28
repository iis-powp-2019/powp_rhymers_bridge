package edu.kis.vh.nursery;

/**
 * Class implementing default stack functionality
 */
public class DefaultCountingOutRhymer {

	private IntArrayStack stack = new IntArrayStack();


	public DefaultCountingOutRhymer(IntArrayStack stack) {
		this.stack = stack;
	}

	public DefaultCountingOutRhymer() {
		stack = new IntArrayStack();
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
