package edu.kis.vh.nursery.list;

class IntegerLinkedList {

	// EMPTY_STACK_VALUE (DefaultCountingOutRhymer) != EMPTY_LIST_VALUE (here)
	private static final int EMPTY_LIST_VALUE = -1;
	
	private Node lastNode;

	private void push(int value) {
		if (lastNode == null)
			lastNode = new Node(value);
		else {
			lastNode.setNextNode(new Node(value));
			lastNode.getNextNode().setPreviousNode(lastNode);
			lastNode = lastNode.getNextNode();
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
		return lastNode.getValue();
	}

	private int pop() {
		if (isEmpty())
			return EMPTY_LIST_VALUE;
		int poppedValue = lastNode.getValue();
		lastNode = lastNode.getPreviousNode();
		return poppedValue;
	}

}
