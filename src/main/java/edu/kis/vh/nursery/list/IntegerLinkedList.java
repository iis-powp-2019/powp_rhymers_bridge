package edu.kis.vh.nursery.list;

public class IntegerLinkedList {

	private static final int EMPTY_LIST_VALUE = -1;
	private Node lastNode;

	public void push(final int value) {
		if (lastNode == null)
			lastNode = new Node(value);
		else {
			lastNode.setNextNode(new Node(value));
			lastNode.getNextNode().setPreviousNode(lastNode);
			lastNode = lastNode.getNextNode();
		}
	}

	public boolean isEmpty() {
		return lastNode == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return EMPTY_LIST_VALUE;
		return lastNode.getValue();
	}

	public int pop() {
		if (isEmpty())
			return EMPTY_LIST_VALUE;
		int returningValue = lastNode.getValue();
		lastNode = lastNode.getPreviousNode();
		return returningValue;
	}

}
