package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer {
	
	private IntLinkedList linkedList;

	public DefaultCountingOutRhymer(IntLinkedList linkedList) { 
		super();
		this.linkedList = linkedList;
	}

	public DefaultCountingOutRhymer() {
		this.linkedList = new IntLinkedList();
	}

	public void countIn(int in) {
		linkedList.countIn(in);
	}

	public boolean callCheck() {
		return linkedList.callCheck();
	}

	public boolean isFull() {
		return linkedList.isFull();
	}

	public int countOut() {
		return linkedList.countOut();
	}
	
    public int peekaboo() {
        return linkedList.peekaboo();
    }    
}


