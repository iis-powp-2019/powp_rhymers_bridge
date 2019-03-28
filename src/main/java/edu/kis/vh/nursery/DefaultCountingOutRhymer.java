package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
	
	IntArrayStack stack;
	
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

	public int countOut() {
		return stack.countOut();
	}

	public DefaultCountingOutRhymer(IntArrayStack stack) {
		super();
		this.stack = stack;
	}
	
	protected int peekaboo() {
		return stack.peekaboo();
	}

}
