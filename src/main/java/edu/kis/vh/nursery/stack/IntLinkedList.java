package edu.kis.vh.nursery.stack;

public class IntLinkedList implements StackInterface {
	private static final int EMPTY_STACK_VALUE = -1;
	private Node last;
	int i;

	@Override
	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().prev = last;
			last = last.getNext();
		}
	}

	@Override
	public boolean isEmpty() {
		return last == null;
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public int top() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		return last.value;
	}

	@Override
	public int pop() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		int ret = last.value;
		last = last.prev;
		return ret;
	}
	
	private class Node {
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