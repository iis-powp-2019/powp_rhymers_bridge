package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collections.IntLinkedList;

public class DefaultCountingOutRhymer implements StackInterface {

	private IntLinkedList intLinkedList;

	
	public DefaultCountingOutRhymer(IntLinkedList linkedList) {
		super();
		this.intLinkedList = linkedList;
	}

	public DefaultCountingOutRhymer() {
		this.intLinkedList=new IntLinkedList();
	}

	@Override
	public void countIn(int in) {
		intLinkedList.push(in);
	}

	@Override
	public int countOut() {
		return intLinkedList.pop();
	}
	
	@Override
	public boolean isFull() {
		return intLinkedList.isFull();
	}
	
	@Override
	public boolean callCheck() {
		return intLinkedList.isEmpty(); 
	}
	
	@Override
	public int peekaboo() {
		return intLinkedList.top();
	}
	
}
