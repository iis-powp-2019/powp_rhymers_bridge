package edu.kis.vh.nursery.list;

public class IntLinkedList {

	private Node last;
	private int i;
	
	protected void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.setPrev(last);
			last = last.next;
		}
	}
	
	private boolean isEmpty() {
		return last == null;
	}
	
	protected boolean isFull() {
		return false;
	}
	
	protected int top() {
		if (isEmpty())
			return -1;
		return last.value;
	}
	
	protected int pop() {
		if (isEmpty())
			return -1;
		int ret = last.value;
		last = last.getPrev();
		return ret;
	}
	
	int getI() {
		return i;
	}
	
	Node getLast() {
		return last;
	}
}

class Node {

	protected final int value;
	private  Node prev;
	protected Node next;
	
	protected Node(int i) {
		value = i;
	}
	
	protected Node getPrev() {
		return prev;
	}
	
	protected void setPrev(Node prev) {
		this.prev = prev;
	}	
}
