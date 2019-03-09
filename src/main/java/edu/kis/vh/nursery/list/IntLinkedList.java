package edu.kis.vh.nursery.list;

/**
 * Linked list which stores ints.
 */
public class IntLinkedList {

	private static final int EMPTY = -1;
	private Node last;
	int i;

	public static int getEMPTY() {
		return EMPTY;
	}

	public void push(int i) {
		if (getLast() == null)
			setLast(new Node(i));
		else {
			getLast().setNext(new Node(i));
			getLast().getNext().setPrev(getLast());
			setLast(getLast().getNext());
		}
	}

	public boolean isEmpty() {
		return getLast() == null;
	}

	public boolean isFull() {
		return false;
	}

	/**
	 * Returns last value added to list. If list is empty returns -1.
	 * @return last value added or -1 if empty.
	 */
	public int top() {
		if (isEmpty())
			return getEMPTY();
		return getLast().getValue();
	}

	public int pop() {
		if (isEmpty())
			return getEMPTY();
		int ret = getLast().getValue();
		setLast(getLast().getPrev());
		return ret;
	}

	public Node getLast() {
		return last;
	}

	public void setLast(Node last) {
		this.last = last;
	}

	public int getI() {
		return i;
	}


	class Node {

		int value;
		Node prev, next;

		Node(int i) {
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
}


