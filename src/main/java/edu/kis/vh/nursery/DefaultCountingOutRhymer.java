package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;


public class DefaultCountingOutRhymer {

	//private IntArrayStack stack;
	private IntLinkedList list;

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
		list.push(in);
	}

	public int countOut() {
		return list.pop();
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public boolean isFull() {
		return list.isFull();
	}

	public int peekaboo() {
		return list.top();
	}

	
}
