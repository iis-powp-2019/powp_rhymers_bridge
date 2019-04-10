package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer {

	IntLinkedList linkedList;

	public DefaultCountingOutRhymer() {
		this.linkedList = new IntLinkedList();
	}

	public DefaultCountingOutRhymer(IntLinkedList linkedList) {
		this.linkedList = linkedList;
	}

	public void countIn(int in) {
		linkedList.push(in);
	}

	public int countOut() {
		return linkedList.pop();
	}

	public boolean callCheck() {
		return linkedList.isEmpty();
	}

	public int peekaboo() {
		return linkedList.top();
	}

	public boolean isFull() {
		return linkedList.isFull();
	}
}
