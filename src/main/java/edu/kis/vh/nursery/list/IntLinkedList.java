package edu.kis.vh.nursery.list;

public class IntLinkedList {

		private class Node {

		private int value;
		private Node prev;
		private Node next;

		public Node(int i) {
			setValue(i);
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public Node getPrev() {
			return prev;
		}

		public void setPrev(Node prev) {
			this.prev = prev;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
	}

	Node last;
	private static final int STACK_EMPTY_VALUE = -1;

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
			return STACK_EMPTY_VALUE;
		return last.getValue();
	}

	public int pop() {
		if (isEmpty())
			return STACK_EMPTY_VALUE;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

}
