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


public class IntLinkedList implements IntStorageInterface {

	private static final int RETURNED_VALUE = -1;
	private Node last;
	private int size = 0;
	
	public int getSize() {
		return size;
	}

	@Override public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
		size++;
	}

	@Override public boolean isEmpty() {
		return last == null;
	}

	@Override public boolean isFull() {
		return false;
	}

	@Override public int top() {
		if (isEmpty())
			return RETURNED_VALUE;
		return last.getValue();
	}

	@Override public int pop() {
		if (isEmpty())
			return RETURNED_VALUE;
		int ret = last.getValue();
		last = last.getPrev();
		size--;
		return ret;
	}

	@Override public int getReturnedValue() {
		return RETURNED_VALUE;
	}


	@Override public Node getLast() {
		return last;
	}

	@Override
	public void setLast(Node last) {
		this.last = last;
		
	}

	

}
