package edu.kis.vh.nursery.list;

/**
 * Class representing doubly-linked list containing values of type int
 */
public class IntLinkedList {

	/**
	 * Class representing single element of the list
	 * Attribute "value" represent the value of a node
	 * Attribute "prev" points to previous node in a list
	 * Attribute "next" points to next node in a list
	 */
	private class Node {

		private int value;
		private Node prev;
		private Node next;

		/**
		 * Constructor
		 * @param i value of a node
		 */
		Node(int i) {
			setValue(i);
		}

		int getValue() {
			return value;
		}

		void setValue(int value) {
			this.value = value;
		}

		Node getPrev() {
			return prev;
		}

		void setPrev(Node prev) {
			this.prev = prev;
		}

		Node getNext() {
			return next;
		}

		void setNext(Node next) {
			this.next = next;
		}
	}

	private static final int EMPTY_INDEX = -1;
    private Node last;
	int i;

	/**
	 * Adds element to the end of the list with value "i"
	 * @param i Value to be added
	 */
	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	/**
	 * Checks if list is empty
	 * @return true if list is empty; false if list isn't empty
	 */
	private boolean isEmpty() {
		return last == null;
	}

	/**
	 * Checks if list is full
	 * @return always returns false since list doesn't have fixed capacity
	 */
	public boolean isFull() {
		return false;
	}

	/**
	 * Returns value of the last element in a list, without removing it
	 * @return value of the last element or -1 if the list is empty
	 */
	public int top() {
		if (isEmpty())
			return EMPTY_INDEX;
		return last.getValue();
	}

	/**
	 * Returns value of the last element in a list and removes that element
	 * @return value of the last element or -1 if the list is empty
	 */
	public int pop() {
		if (isEmpty())
			return EMPTY_INDEX;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

}
