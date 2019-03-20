package edu.kis.vh.nursery.list;

public class IntLinkedList {
	private class Node {

		private int value;
		private Node prev;
		private Node next;

		public Node(final int i) {
			value = i;
		}

		int getValue() {
			return value;
		}

		Node getNext() {
			return next;
		}

		void setNext(final Node next) {
			this.next = next;
		}

		Node getPrev() {
			return prev;
		}

		void setPrev(final Node prev) {
			this.prev = prev;
		}

	}

	private static final int STACK_EMPTY_VALUE = -1;
	private Node last;
	private int i; // TODO: ta zmienna nie jest używana, trzeba usunąć

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
		final int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

}
