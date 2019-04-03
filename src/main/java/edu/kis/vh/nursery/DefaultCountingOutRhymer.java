package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntegerLinkedList;
import edu.kis.vh.nursery.stack.StackCollection;

public class DefaultCountingOutRhymer {
	private StackCollection rhymer;

	public DefaultCountingOutRhymer() {
		rhymer = new IntegerLinkedList();
	}

	public DefaultCountingOutRhymer(StackCollection rhymer) {
		this.rhymer = rhymer;
	}

	public void countIn(int newValue) {
		rhymer.push(newValue);
	}

	public boolean isEmpty() {
		return rhymer.isEmpty();
	}

	public boolean isFull() {
		return rhymer.isFull();
	}

	public int getPeekaboo() {
		return rhymer.getTop();
	}

	public int countOut() {
		return rhymer.pop();
	}
}
