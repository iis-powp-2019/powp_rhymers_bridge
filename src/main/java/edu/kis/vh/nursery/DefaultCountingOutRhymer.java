package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntArrayStack;
import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer {

	private IntArrayStack intArrayStack;
	private IntLinkedList intLinkedList;

	public DefaultCountingOutRhymer() {
		intLinkedList = new IntLinkedList();
	}

	public DefaultCountingOutRhymer(IntLinkedList intLinkedList) {
		this.intLinkedList = intLinkedList;
	}

	public void countIn(int in) {
		intLinkedList.push(in);
	}

	public int countOut() {
		return intLinkedList.pop();
	}

	boolean callCheck() {
		return intLinkedList.isEmpty();
	}

	boolean isFull() {
		return false;
	}

	int peekaboo() {
		if (intLinkedList.isEmpty())
			return -1;
		return intLinkedList.top();
	}
}
