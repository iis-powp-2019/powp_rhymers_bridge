package edu.kis.vh.nursery.list;

public class IntLinkedList {

	private static final int RETURNED_VALUE = -1;
	private Node last;
	private int i;

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return RETURNED_VALUE;
		return last.getValue();
	}

	public int pop() {
		if (isEmpty())
			return RETURNED_VALUE;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

	public static int getReturnedValue() {
		return RETURNED_VALUE;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public Node getLast() {
		return last;
	}

	public void setLast(Node last) {
		this.last = last;
	}

}
