package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntArrayStack;

/**
 * @author Jan
 * 
 */
public class DefaultCountingOutRhymer {
	private IntStack stack;

	public DefaultCountingOutRhymer(IntStack stack) {
		super();
		this.stack = stack;
	}

	public DefaultCountingOutRhymer() {
		super();
		this.stack = new IntArrayStack();;
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
