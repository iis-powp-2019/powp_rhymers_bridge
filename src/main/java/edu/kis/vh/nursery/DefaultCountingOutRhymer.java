package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntArrayStackInterface;
import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer {
	

	private IntArrayStackInterface stack;

	public DefaultCountingOutRhymer(IntArrayStackInterface stack) {
		super();
		this.stack = stack;
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

	public DefaultCountingOutRhymer() {
		this.stack = new IntLinkedList();
	}

	
	public void setStack(IntArrayStackInterface stack) {
		this.stack = stack;
	}
	
	protected int peeKaBoo() {
		return stack.peeKaBoo();
	}
	
	
	
	
	
	

	
	

}
