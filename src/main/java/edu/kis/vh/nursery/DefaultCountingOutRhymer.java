package edu.kis.vh.nursery;

/**
 * @author Jan
 * 
 */
public class DefaultCountingOutRhymer {
	
	//int stack
	private IntArrayStack stack;

	public DefaultCountingOutRhymer(IntArrayStack stack) {
		super();
		this.stack = stack;
	}

	public DefaultCountingOutRhymer() {
		super();
		this.stack = new IntArrayStack();
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

	public int peekAboo() {
		return stack.peekAboo();
	}

	public int countOut() {
		return stack.countOut();
	}
	
	
}
