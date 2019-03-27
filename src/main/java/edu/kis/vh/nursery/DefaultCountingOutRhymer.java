package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private IntArrayStack stack;

	public void countIn(int in) {
		stack.countIn(in);
	}

	public boolean callCheck() {
		return stack.callCheck();
	}

	public boolean isFull() {
		return stack.isFull();
	}

	public int countOut() {
		return stack.countOut();
	}

	public DefaultCountingOutRhymer() {
		stack = new IntArrayStack();
	}
	
	public DefaultCountingOutRhymer(IntArrayStack stack) {
		super();
		this.stack = stack;
	}

	public int peekaboo() {
		return stack.peekaboo();
	}
	

}
