package edu.kis.vh.nursery.list;

public class IntLinkedList {

	private static final int EMPTY = -1;
	private Node last;
	private int i;

	public void push(final int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return EMPTY;
		
		return last.getValue();
	}

	public int pop() {
		if (isEmpty())
			return EMPTY;
		
		final int ret = last.getValue();
		last = last.getPrev();
		
		return ret;
	}

}
