package edu.kis.vh.nursery;

import edu.kis.vh.nursery.storage.IntArrayStack;
import edu.kis.vh.nursery.storage.IntLinkedList;
import edu.kis.vh.nursery.storage.StackInterface;

public class DefaultCountingOutRhymer {

	private IntArrayStack intArrayStack;
	private StackInterface intLinkedList = new IntLinkedList();

	public DefaultCountingOutRhymer(IntArrayStack intArrayStack) {
		this.intArrayStack = intArrayStack;
	}
	
	public DefaultCountingOutRhymer(IntLinkedList intLinkedList) {
		this.intLinkedList = intLinkedList;
	}

	public DefaultCountingOutRhymer() {
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

	public int peekaboo() {
		return intLinkedList.top();
	}

	public int countOut() {
		return intLinkedList.pop();
	}
}
