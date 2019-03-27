package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
	
	private IntArrayStack stack;

	public DefaultCountingOutRhymer(IntArrayStack stack) {
		super();
		this.stack = stack;
	}
	
	public int getTotal() {
		return stack.getTotal();
	}

	public void setTotal(int total) {
		stack.setTotal(total);
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

	public DefaultCountingOutRhymer() {
		this.stack = new IntArrayStack();
	}

	public IntArrayStack getStack() {
		return stack;
	}

	public void setStack(IntArrayStack stack) {
		this.stack = stack;
	}
	
	protected int peeKaBoo() {
		return stack.peeKaBoo();
	}
	
	
	
	
	
	

	
	

}
