package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

/**
 * Class implementing default stack functionality
 */
public class DefaultCountingOutRhymer {

	private Stackable stack;


	public DefaultCountingOutRhymer(Stackable stack) {
		this.stack = stack;
	}

	public DefaultCountingOutRhymer() {
		stack = new IntLinkedList();
	}

	public int getTotal() {
		return stack.getTotal();
	}

	public void countIn(int in) {
		stack.push(in);
	}

	public boolean callCheck() {
		return stack.isEmpty();
	}

	public boolean isFull() {
		return stack.isFull();
	}

	public int peekaboo() {
		return stack.top();
	}

	public int countOut() {
		return stack.pop();
	}
}
