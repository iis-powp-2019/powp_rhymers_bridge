package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntLinkedList;


public class DefaultCountingOutRhymer {

	//private IntArrayStack stackImplementation;
	private IStack stackImplementation;

	public DefaultCountingOutRhymer(IStack stackImplementation) {
		super();
		this.stackImplementation = stackImplementation;
	}
	
	public DefaultCountingOutRhymer() {
		this.stackImplementation = new IntLinkedList();
	}

	public int getTotal() {
		//return stackImplementation.getTotal();
		return stackImplementation.getTotal();
	}

	public void countIn(int in) {
		stackImplementation.countIn(in);
	}

	public int countOut() {
		return stackImplementation.countOut();
	}

	public boolean callCheck() {
		return stackImplementation.callCheck();
	}

	public boolean isFull() {
		return stackImplementation.isFull();
	}

	public int peekaboo() {
		return stackImplementation.peekaboo();
	}

	
}
