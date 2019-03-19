package edu.kis.vh.nursery.list;

/**
 * @author 202247
 * Lista przechowujaca liczby całkowite.
 *
 */

public class IntLinkedList {

	private static final int EMPTY = -1;
	private Node last;

	/**
	 * @param i
	 * Umieszczenie w liscie elementu
	 *
	 */
	public void push(final int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	/**
	 * 
	 * @return boolean
	 * Sprawdza czy lista jest pusta.
	 */
	public boolean isEmpty() {
		return last == null;
	}

	/**
	 * @return boolean
	 * Sprawdza czy lista jest pełna.
	 */
	public boolean isFull() {
		return false;
	}

	/**
	 * @return int
	 * Ostatni element z listy jest zwracany i usuwany
	 */
	public int top() {
		if (isEmpty())
			return EMPTY;
		return last.getValue();
	}

	public int pop() {
		if (isEmpty())
			return EMPTY;
		final int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

	private class Node {

		private int value;
		private Node prev;
		private Node next;

		public Node(int i) {
			value = i;
		}

		public int getValue() {
			return value;
		}

		public Node getPrev() {
			return prev;
		}

		public void setPrev(final Node prev) {
			this.prev = prev;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(final Node next) {
			this.next = next;
		}

	}

}
