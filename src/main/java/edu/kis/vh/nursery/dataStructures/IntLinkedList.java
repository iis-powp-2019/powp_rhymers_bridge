package edu.kis.vh.nursery.dataStructures;

/**
 * Class representing doubly-linked dataStructures containing values of type int
 */
public class IntLinkedList implements DataStructure{
    private Node last;

	/**
	 * Class representing single element of the dataStructures
	 * Attribute "value" represent the value of a node
	 * Attribute "prev" points to previous node in a dataStructures
	 * Attribute "next" points to next node in a dataStructures
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

	/**
	 * Adds element to the end of the dataStructures with value "i"
	 * @param i Value to be added
	 */
	public void countIn(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	/**
	 * Checks if dataStructures is empty
	 * @return true if dataStructures is empty; false if dataStructures isn't empty
	 */
    public boolean callCheck() {
		return last == null;
	}

	/**
	 * Checks if dataStructures is full
	 * @return always returns false since dataStructures doesn't have fixed capacity
	 */
	public boolean isFull() {
		return false;
	}

	/**
	 * Returns value of the last element in a dataStructures, without removing it
	 * @return value of the last element or -1 if the dataStructures is empty
	 */
	public int peekaboo() {
		if (callCheck())
			return EMPTY_INDEX;
		return last.getValue();
	}

	/**
	 * Returns value of the last element in a dataStructures and removes that element
	 * @return value of the last element or -1 if the dataStructures is empty
	 */
	public int countOut() {
		if (callCheck())
			return EMPTY_INDEX;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

}
