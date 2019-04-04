package edu.kis.vh.nursery.list;

import edu.kis.vh.nursery.intStack.Stackable;

public class IntLinkedList implements Stackable {

		private class Node {

		private int value;
		private Node prev;
		private Node next;

		public Node(int i) {
			setValue(i);
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public Node getPrev() {
			return prev;
		}

		public void setPrev(Node prev) {
			this.prev = prev;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
	}

	Node last;
	private static final int STACK_EMPTY_VALUE = -1;
	private int total = STACK_EMPTY_VALUE;

	@Override
	public int getTotal() {
		return total;
	}

	@Override
	public void countIn(int i) {
		total++;
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	/**
	 * @return true if stack is empty
	 */
	@Override public boolean callCheck() {
		return last == null;
	}

	/**
	 * @return true if stack is full
	 */
	@Override public boolean isFull() {
		return false;
	}

	/**
	 * @return STACK_EMPTY_VALUE if stack is empty, if stack is not empty then returns value pointed by STACK_EMPTY_INDICATOR
	 */
	@Override
	public int peekaboo() {
		if (callCheck())
			return STACK_EMPTY_VALUE;
		return last.getValue();
	}

	/**
	 * @return STACK_EMPTY_VALUE if stack is empty, if stack is not empty then returns value pointed by STACK_EMPTY_INDICATOR
	 * and after that decrements STACK_EMPTY_INDICATOR
	 */
	@Override public int countOut() {
			if (callCheck())
				return STACK_EMPTY_VALUE;
			final int ret = last.getValue();
			last = last.getPrev();
			return ret;
	}

}
