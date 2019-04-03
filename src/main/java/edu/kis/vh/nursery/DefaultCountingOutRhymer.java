package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer {

	IntArrayStack intArrayStack = new IntArrayStack();
	IntLinkedList intLinkedList = new IntLinkedList();
	
	public DefaultCountingOutRhymer() {
		
	}
	
	public DefaultCountingOutRhymer(IntLinkedList intLinkedList) {
		super();
		this.intLinkedList = intLinkedList;
	}
	
	public int peekaboo() {
        return intLinkedList.top();
    }
	
	public int getTotal() {
		return intLinkedList.getSize();
	}

	public void countIn(int in) {
		intLinkedList.push(in);
	}

	public boolean callCheck() {
		return intLinkedList.isEmpty();
	}

	public boolean isFull() {
		return intLinkedList.isFull();
	}

	public int countOut() {
		return intLinkedList.pop();
	}

	
	


}
