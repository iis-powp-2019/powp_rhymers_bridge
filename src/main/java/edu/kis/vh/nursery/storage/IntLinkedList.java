package edu.kis.vh.nursery.storage;

public class IntLinkedList implements StackInterface {
	
	private class Node {

		final int value;
		Node prev, next;

		Node(final int i) {
			value = i;
		}

	}

	private Node last;
	int i;

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.StackInterface#push(int)
	 */
	@Override
	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.StackInterface#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return last == null;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.StackInterface#isFull()
	 */
	@Override
	public boolean isFull() {
		return false;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.StackInterface#top()
	 */
	@Override
	public int top() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		return last.value;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.nursery.list.StackInterface#pop()
	 */
	@Override
	public int pop() {
		if (isEmpty())
			return EMPTY_STACK_VALUE;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

}
