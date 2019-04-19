package edu.kis.vh.nursery.stack;

public class IntLinkedList implements StackInterface {

	private Node last;
	int i;
	int total = 0;

	@Override
	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
		++total;
	}

	@Override
	public boolean isEmpty() {
		return last == null;
	}

	@Override
	public boolean isFull() {
		return total == STACK_MAX_SIZE;
	}

	@Override
	public int top() {
		if (isEmpty())
			return STACK_VALUE;
		return last.getValue();
	}

	@Override
	public int pop() {
		if (isEmpty())
			return STACK_VALUE;
		int ret = last.getValue();
		last = last.getPrev();
		--total;
		return ret;
	}
	
	@Override
	public int getTotal() {
		return total;
	}

}

class Node {

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
