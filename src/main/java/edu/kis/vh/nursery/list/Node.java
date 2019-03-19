package edu.kis.vh.nursery.list;

public class Node {

	private int value;
	private Node previousNode;
	private Node nextNode;

	public Node(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public Node getPreviousNode() {
		return previousNode;
	}

	public void setPreviousNode(Node previousNode) {
		this.previousNode = previousNode;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
}
