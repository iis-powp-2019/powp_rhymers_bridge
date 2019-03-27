package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer {

	private IntLinkedList list;

	public void countIn(int in) {
		list.push(in);
	}

	public boolean callCheck() {
		return list.isEmpty();
	}

	public boolean isFull() {
		return list.isFull();
	}

	public int countOut() {
		return list.pop();
	}

	public DefaultCountingOutRhymer() {
		list = new IntLinkedList();
	}
	
	public DefaultCountingOutRhymer(IntLinkedList list) {
		super();
		this.list = list;
	}

	public int peekaboo() {
		return list.top();
	}
	

}
