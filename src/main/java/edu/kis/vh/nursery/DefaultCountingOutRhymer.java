package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collections.IntArrayStack;
import edu.kis.vh.nursery.collections.IntLinkedList;
import edu.kis.vh.nursery.collections.Stack;

public class DefaultCountingOutRhymer {

	Stack intArrayStack = new IntLinkedList();

	public DefaultCountingOutRhymer(IntLinkedList intArrayStack) {
		this.intArrayStack = intArrayStack;
	}

	public DefaultCountingOutRhymer(IntArrayStack intArrayStack) {
		this.intArrayStack = intArrayStack;
	}

	public DefaultCountingOutRhymer() {
	}

	public void countIn(int in) {
		intArrayStack.push(in);
	}

	boolean callCheck() {
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