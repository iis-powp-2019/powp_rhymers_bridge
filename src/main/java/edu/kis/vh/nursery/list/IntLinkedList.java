package edu.kis.vh.nursery.list;

public class IntLinkedList implements Stackable {

	private static final int STACK_EMPTY_VALUE = -1;
	private Node last;
	private int i;

	@Override
	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	@Override
	public boolean isEmpty() {
		return last == null;
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public int top() {
		if (isEmpty())
			return STACK_EMPTY_VALUE;
		return last.getValue();
	}

	@Override
	public int pop() {
		if (isEmpty())
			return STACK_EMPTY_VALUE;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

	public int getI() {
		return i;
	}

}

class Node {

	private int value;
	private Node prev;
	private Node next;

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