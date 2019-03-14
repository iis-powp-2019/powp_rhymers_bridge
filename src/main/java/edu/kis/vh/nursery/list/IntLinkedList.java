package edu.kis.vh.nursery.list;


class Node {

	public int value;
	public Node prev, next;

	public Node(int i) {
		value = i;
	}

}


public class IntLinkedList {

	private static final int EMPTY_STACK_RETURN_VALUE = -1;
	Node last;
	int i;

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	public boolean isEmpty() {
		return last == null;
	}

	// TODO: make linked list have maxCapacity
	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return EMPTY_STACK_RETURN_VALUE;
		return last.value;
	}
	
	public int pop() {
		if (isEmpty())
			return EMPTY_STACK_RETURN_VALUE;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

}
