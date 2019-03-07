package edu.kis.vh.nursery.list;

public class Node {

	protected int value;
	private Node prev;
	protected Node next;

	protected Node(int i) {
		value = i;
	}

	protected Node getPrev() {
		return prev;
	}

	protected void setPrev(Node prev) {
		this.prev = prev;
	}	
}