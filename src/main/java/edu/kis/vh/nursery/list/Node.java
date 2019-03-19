package edu.kis.vh.nursery.list;

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