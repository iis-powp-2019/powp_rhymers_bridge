package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntArrayStack;
import edu.kis.vh.nursery.list.IntLinkedList;
import edu.kis.vh.nursery.list.StackInterface;

public class DefaultCountingOutRhymer {

	private StackInterface intLinkedList = new IntLinkedList();

	public DefaultCountingOutRhymer(IntArrayStack intArrayStack) {
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
