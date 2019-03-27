package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private IntArrayStack stack;

	
	public DefaultCountingOutRhymer(IntArrayStack stack) {
		super();
		this.stack = stack;
	}

	public DefaultCountingOutRhymer() {
		this.stack=new IntArrayStack();
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
	
	boolean isFull() {
		return stack.isFull();
	}
	boolean callCheck() {
		return stack.callCheck(); 
	}
	
	int peekaboo() {
		return stack.peekaboo();
	}
	
}
