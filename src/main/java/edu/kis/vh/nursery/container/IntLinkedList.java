package edu.kis.vh.nursery.container;

import edu.kis.vh.nursery.StackInterface;

public class IntLinkedList implements StackInterface {

	private static final int EMPTY_VALUE = -1;
	private Node last;
	int i;

	public void countIn(final int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	public boolean callCheck() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int peekaboo() {
		if (callCheck())
			return EMPTY_VALUE;
		return last.value;
	}

	public int countOut() {
		if (callCheck())
			return EMPTY_VALUE;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

}
