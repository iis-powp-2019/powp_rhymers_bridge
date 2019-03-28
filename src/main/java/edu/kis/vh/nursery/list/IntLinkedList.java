package edu.kis.vh.nursery.list;

public class IntLinkedList {

	private static final int INDEX_OF_EMPTY_STACK = -1;
	private Node last;
	private int total = INDEX_OF_EMPTY_STACK;

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

	public boolean callCheck() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int peekaboo() {
		if (callCheck())
			return INDEX_OF_EMPTY_STACK;
		return last.getValue();
	}

	public int countOut() {
		total--;
		if (callCheck())
			return INDEX_OF_EMPTY_STACK;
		final int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

	public int getTotal() {
		return total;
	}
}
