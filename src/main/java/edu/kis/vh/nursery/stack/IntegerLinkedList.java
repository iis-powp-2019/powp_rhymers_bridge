package edu.kis.vh.nursery.stack;

/**
 * Stores integers inside linked stack, where each item has reference to previous and next one
 */
public class IntegerLinkedList implements StackCollection {

	// EMPTY_STACK_VALUE (DefaultCountingOutRhymer) != EMPTY_VALUE (here)
	private Node lastNode;

	/**
	 * Add integer to a stack
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
	 * Check whether stack is empty
	 * @return true if stack is empty
	 */
	@Override
	public boolean isEmpty() {
		return lastNode == null;
	}

	/**
	 * Check whether stack is full
	 * @return true if stack is full
	 */
	@Override
	public boolean isFull() {
		return false;
	}

	/**
	 * Returns firstly added integer, stack will not be modified
	 * @return Firstly added integer, or EMPTY_VALUE if stack is empty
	 * @see #pop()
	 */
	@Override
	public int getTop() {
		if (isEmpty())
			return EMPTY_VALUE;
		return lastNode.getValue();
	}

	/**
	 * Removes and returns recently added integer
	 * @return Recently added integer, or EMPTY_VALUE if stack is empty
	 * @see #getTop()
	 */
	@Override
	public int pop() {
		if (isEmpty())
			return EMPTY_VALUE;
		int poppedValue = lastNode.getValue();
		lastNode = lastNode.getPreviousNode();
		return poppedValue;
	}

}
