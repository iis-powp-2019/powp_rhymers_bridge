package edu.kis.vh.nursery.list;

public class Node {

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
