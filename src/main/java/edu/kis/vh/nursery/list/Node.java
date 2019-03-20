package edu.kis.vh.nursery.list;

class Node {

	private int value;
	private Node previousNode;
	private Node nextNode;

	Node(int value) {
		this.value = value;
	}

	int getValue() {
		return value;
	}

	void setValue(int value) {
		this.value = value;
	}

	Node getPreviousNode() {
		return previousNode;
	}

	void setPreviousNode(Node previousNode) {
		this.previousNode = previousNode;
	}

	Node getNextNode() {
		return nextNode;
	}

	void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
}
