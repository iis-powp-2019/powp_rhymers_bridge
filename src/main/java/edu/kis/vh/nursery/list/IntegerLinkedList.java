package edu.kis.vh.nursery.list;

/**
 * Stores integers inside linked list, where each item has reference to previous and next one
 */
public class IntegerLinkedList implements StackCollection {

	// EMPTY_STACK_VALUE (DefaultCountingOutRhymer) != EMPTY_LIST_VALUE (here)
	private static final int EMPTY_LIST_VALUE = -1;
	
	private Node lastNode;

	/**
	 * Add integer to a list
	 * @param value Integer to be added
	 */
	@Override
	public void push(int value) {
		if (lastNode == null)
			lastNode = new Node(value);
		else {
			lastNode.setNextNode(new Node(value));
			lastNode.getNextNode().setPreviousNode(lastNode);
			lastNode = lastNode.getNextNode();
		}
	}

	/**
	 * Check whether list is empty
	 * @return true if list is empty
	 */
	@Override
	public boolean isEmpty() {
		return lastNode == null;
	}

	/**
	 * Check whether list is full
	 * @return true if list is full
	 */
	@Override
	public boolean isFull() {
		return false;
	}

	/**
	 * Returns firstly added integer, list will not be modified
	 * @return Firstly added integer, or EMPTY_LIST_VALUE if list is empty
	 * @see #pop()
	 */
	@Override
	public int getTop() {
		if (isEmpty())
			return EMPTY_LIST_VALUE;
		return lastNode.getValue();
	}

	/**
	 * Removes and returns recently added integer
	 * @return Recently added integer, or EMPTY_LIST_VALUE if list is empty
	 * @see #getTop()
	 */
	@Override
	public int pop() {
		if (isEmpty())
			return EMPTY_LIST_VALUE;
		int poppedValue = lastNode.getValue();
		lastNode = lastNode.getPreviousNode();
		return poppedValue;
	}

}
