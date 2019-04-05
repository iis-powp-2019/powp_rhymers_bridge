package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import edu.kis.vh.nursery.list.Stack;

public class DefaultCountingOutRhymer {

	protected Stack intArrayStack = new IntLinkedList();

	public DefaultCountingOutRhymer(IntLinkedList intArrayStack) {
		this.intArrayStack = intArrayStack;
	}

	public DefaultCountingOutRhymer() {
	}

	public void countIn(int in) {
		intArrayStack.push(in);
	}

	public boolean callCheck() {
		return intArrayStack.isEmpty();
	}

	public boolean isFull() {
		return intArrayStack.isFull();
	}

	protected int peekaboo() {
		return intArrayStack.top();
	}

	public int countOut() {
		return intArrayStack.pop();
	}

}