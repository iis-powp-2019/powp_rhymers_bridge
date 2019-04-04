package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer {

	private IntLinkedList intLinkedList;

	
	public DefaultCountingOutRhymer(IntLinkedList linkedList) {
		super();
		this.intLinkedList = linkedList;
	}

	public DefaultCountingOutRhymer() {
		this.intLinkedList=new IntLinkedList();
	}

	public void countIn(int in) {
		intLinkedList.push(in);
	}

	public int countOut() {
		return intLinkedList.pop();
	}
	
	boolean isFull() {
		return intLinkedList.isFull();
	}
	boolean callCheck() {
		return intLinkedList.isEmpty(); 
	}
	
	int peekaboo() {
		return intLinkedList.top();
	}
	
}
