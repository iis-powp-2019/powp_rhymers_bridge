package edu.kis.vh.nursery.list;

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

	public void setI(int i) {
		this.i = i;
	}
}
