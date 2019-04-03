package edu.kis.vh.nursery;

/**
 * Class implementing stack
 */
public class DefaultCountingOutRhymer {

	private IntArrayStack stack;

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

	public void countIn(int in) {
		stack.countIn(in);
	}

	public int countOut() {
		return stack.countOut();
	}

	public boolean isEmpty() {
		return stack.isEmpty();
	}

	public boolean isFull() {
		return stack.isFull();
	}

	public int peekaboo() {
		return stack.peekaboo();
	}

	
}
