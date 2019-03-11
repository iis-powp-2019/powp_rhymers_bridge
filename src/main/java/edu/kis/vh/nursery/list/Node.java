package edu.kis.vh.nursery.list;

public class Node {

	protected int value;
	public Node prev, next;

	public Node(int i) {
		setValue(i);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
