package edu.kis.vh.nursery.list;

class Node {

	private int value;
	private Node prevElement;
	private Node nextElement;

	Node(int i) {
		value = i;
	}

	int getValue() {
		return value;
	}

	Node getPrevElement() {
		return prevElement;
	}

	Node getNextElement() {
		return nextElement;
	}

	void setNextElement(Node nextElement) {
		this.nextElement = nextElement;
	}

	void setPrevElement(Node prevElement) {
		this.prevElement = prevElement;
	}
}
