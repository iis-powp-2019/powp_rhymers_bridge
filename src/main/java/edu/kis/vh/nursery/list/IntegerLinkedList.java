package edu.kis.vh.nursery.list;

public class IntegerLinkedList {

	Node lastNode;

	public void push(int value) {
		if (lastNode == null)
			lastNode = new Node(value);
		else {
			lastNode.nextNode = new Node(value);
			lastNode.nextNode.previousNode = lastNode;
			lastNode = lastNode.nextNode;
		}
	}

	public boolean isEmpty() {
		return lastNode == null;
	}

	public boolean isFull() {
		return false;
	}

	public int getTop() {
		if (isEmpty())
			return -1;
		return lastNode.value;
	}

	public int pop() {
		if (isEmpty())
			return -1;
		int poppedValue = lastNode.value;
		lastNode = lastNode.previousNode;
		return poppedValue;
	}

}
