package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntLinkedList;


public class DefaultCountingOutRhymer {

	//private IntArrayStack stack;
	private Stack list;

	public DefaultCountingOutRhymer(IntLinkedList list) {
		super();
		this.list = list;
	}
	
	public DefaultCountingOutRhymer() {
		this.list = new IntLinkedList();
	}

	public int getTotal() {
		//return stack.getTotal();
		return list.getTotal();
	}

	public void countIn(int in) {
		list.countIn(in);
	}

	public int countOut() {
		return list.countOut();
	}

	public boolean callCheck() {
		return list.callCheck();
	}

	public boolean isFull() {
		return list.isFull();
	}

	public int peekaboo() {
		return list.peekaboo();
	}

	
}
