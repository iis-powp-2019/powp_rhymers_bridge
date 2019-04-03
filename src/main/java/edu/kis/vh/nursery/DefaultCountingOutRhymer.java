package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stacks.IntLinkedList;
import edu.kis.vh.nursery.stacks.IIntStack;

public class DefaultCountingOutRhymer {
private IIntStack intStack;

	public DefaultCountingOutRhymer(IntLinkedList intLinkedList) {
		this.intStack = intLinkedList;
	}

	public DefaultCountingOutRhymer() {
		this.intStack = new IntLinkedList();
	}

	public void countIn(int in) {
		intStack.push(in);
	}

	public boolean callCheck() {
		return intStack.isEmpty();
	}

	public boolean isFull() {
		return intStack.isFull();
	}

	public int peekaboo() {
		return intStack.top();
	}

	public int countOut() {
		return intStack.pop();
	}
}
