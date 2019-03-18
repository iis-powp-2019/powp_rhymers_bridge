package edu.kis.vh.nursery.list;

public class IntLinkedList {

	private static final int STACK_EMPTY = -1;
	private Node last;
	//int i;

	private void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	private boolean isEmpty() {
		return last == null;
	}

	private boolean isFull() {
		return false;
	}

	private int top() {
		if (isEmpty())
			return STACK_EMPTY;
		return last.getValue();
	}

	private int pop() {
		if (isEmpty())
			return -1;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

}
