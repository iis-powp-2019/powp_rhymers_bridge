package edu.kis.vh.nursery.stack;

import edu.kis.vh.nursery.stack.Stackable;

public class IntLinkedList implements Stackable {

	static final int INDEX_OF_EMPTY_STACK = -1;
	private Node last;
	private int total = INDEX_OF_EMPTY_STACK;

	@Override
	public void countIn(int i) {
		total++;
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	@Override
	public boolean callCheck() {
		return last == null;
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public int peekaboo() {
		if (callCheck())
			return INDEX_OF_EMPTY_STACK;
		return last.getValue();
	}

	@Override
	public int countOut() {
		total--;
		if (callCheck())
			return INDEX_OF_EMPTY_STACK;
		final int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

	@Override
	public int getTotal() {
		return total;
	}
}
