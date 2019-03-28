package edu.kis.vh.nursery.list;

import edu.kis.vh.nursery.Stackable;

class Node {

	private final int value;
	private Node prev;
	private Node next;

	Node(final int i) {
		value = i;
	}

	public int getValue() {
		return value;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(final Node prev) {
		this.prev = prev;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(final Node next) {
		this.next = next;
	}
}


public class IntLinkedList implements Stackable {

	private static final int EMPTY_VALUE = -1;
	private Node last;
	private final int i=0;
	private int total = EMPTY_VALUE;

	@Override
	public void push(final int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
		total++;
	}

	@Override
	public int getTotal() {
		return total;
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
			return EMPTY_VALUE;
		return last.getValue();
	}

	@Override
	public int pop() {
		if (isEmpty())
			return EMPTY_VALUE;
		final int ret = last.getValue();
		last = last.getPrev();
		total--;
		return ret;
	}

}
