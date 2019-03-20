package edu.kis.vh.nursery.list;

public class IntegerLinkedList {

	// EMPTY_STACK_VALUE (DefaultCountingOutRhymer) != EMPTY_LIST_VALUE (here)
	private static final int EMPTY_LIST_VALUE = -1;
	
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
			return EMPTY_LIST_VALUE;
		return lastNode.value;
	}

	public int pop() {
		if (isEmpty())
			return EMPTY_LIST_VALUE;
		int poppedValue = lastNode.value;
		lastNode = lastNode.previousNode;
		return poppedValue;
	}

}
