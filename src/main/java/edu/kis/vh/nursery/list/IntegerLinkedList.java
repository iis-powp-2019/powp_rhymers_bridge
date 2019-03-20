package edu.kis.vh.nursery.list;

class IntegerLinkedList {

	// EMPTY_STACK_VALUE (DefaultCountingOutRhymer) != EMPTY_LIST_VALUE (here)
	private static final int EMPTY_LIST_VALUE = -1;
	
	private Node lastNode;

	private void push(int value) {
		if (lastNode == null)
			lastNode = new Node(value);
		else {
			lastNode.nextNode = new Node(value);
			lastNode.nextNode.previousNode = lastNode;
			lastNode = lastNode.nextNode;
		}
	}

	private boolean isEmpty() {
		return lastNode == null;
	}

	private boolean isFull() {
		return false;
	}

	private int getTop() {
		if (isEmpty())
			return EMPTY_LIST_VALUE;
		return lastNode.value;
	}

	private int pop() {
		if (isEmpty())
			return EMPTY_LIST_VALUE;
		int poppedValue = lastNode.value;
		lastNode = lastNode.previousNode;
		return poppedValue;
	}

}
