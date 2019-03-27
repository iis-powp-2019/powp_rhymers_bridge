package edu.kis.vh.nursery.list;

public class IntLinkedList {
	private static final int EMPTY_STACK_VALUE = -1;
	private Node last;
	int i;

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().prev = last;
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
			return EMPTY_STACK_VALUE;
		return last.value;
	}

	public int pop() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		int ret = last.value;
		last = last.prev;
		return ret;
	}
	
	public class Node {
		protected int value;
		protected Node prev;
		protected Node next;

		protected Node(int i) {
			value = i;
		}

		protected Node getNext() {
			return next;
		}

		protected void setNext(Node next) {
			this.next = next;
		}
	}
}