package edu.kis.vh.nursery.list;

public class IntLinkedList {
	private static final int EMPTY_STACK_VALUE = -1;
	private Node last;
	int i;

	protected void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().prev = last;
			last = last.getNext();
		}
	}

	protected boolean isEmpty() {
		return last == null;
	}

	protected boolean isFull() {
		return false;
	}

	protected int top() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		return last.value;
	}

	protected int pop() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		int ret = last.value;
		last = last.prev;
		return ret;
	}
}