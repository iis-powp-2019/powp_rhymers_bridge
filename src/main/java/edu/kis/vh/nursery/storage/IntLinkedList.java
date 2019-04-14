package edu.kis.vh.nursery.storage;

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

	@Override public int peekaboo() {
		if (isEmpty())
			return RETURN_DEFAULT;
		return last.getValue();
	}

	@Override public int pop() {
		if (isEmpty())
			return RETURN_DEFAULT;
		int ret = last.getValue();
		last = last.getPrev();
		size--;
		return ret;
	}

	public int getReturnedValue() {
		return RETURN_DEFAULT;
	}


	public Node getLast() {
		return last;
	}

	

}
