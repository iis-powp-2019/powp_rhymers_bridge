package edu.kis.vh.nursery.list;

class Node {

	private int value;
	private Node prev, next;

	public Node(int i) {
		value = i;
	}

	public int getValue() {
		return value;
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


	public Node getLast() {
		return last;
	}

	

}
