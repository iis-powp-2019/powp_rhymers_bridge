package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stacks.IntLinkedList;
import edu.kis.vh.nursery.stacks.IIntStack;

public class DefaultCountingOutRhymer {
private IIntStack iIntStack;

	public DefaultCountingOutRhymer(IIntStack iIntStack) {
		this.iIntStack = iIntStack;
	}

	public DefaultCountingOutRhymer() {
		this.iIntStack = new IntLinkedList();
	}

	public void countIn(int in) {
		iIntStack.push(in);
	}

	public boolean callCheck() {
		return iIntStack.isEmpty();
	}

	public boolean isFull() {
		return iIntStack.isFull();
	}

	public int peekaboo() {
		return iIntStack.top();
	}

	public int countOut() {
		return iIntStack.pop();
	}
}
