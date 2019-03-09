package edu.kis.vh.nursery.list;

/**
 * Linked list which stores ints.
 */
//TODO: think about changing methods names (e.g. push to add)
public class IntLinkedList {

	private static final int EMPTY = -1;
	private Node last;

	//TODO: remove unused variable.
	int i;

	private static int getEMPTY() {
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

	private Node getLast() {
		return last;
	}

	private void setLast(Node last) {
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
}


