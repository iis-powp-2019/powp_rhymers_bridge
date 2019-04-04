package edu.kis.vh.nursery.Containers;


class Node {

	public int value;
	public Node prev, next;

	public Node(int i) {
		value = i;
	}

}


public class IntLinkedList implements StackInterface {

	Node last;
	int i;

	public void countIn(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	public boolean callCheck() {
		return last == null;
	}

	// TODO: make linked list have maxCapacity
	public boolean isFull() {
		return false;
	}

	public int peekaboo() {
		if (callCheck())
			return NOT_FOUND_RETURN;
		return last.value;
	}
	
	public int countOut() {
		if (callCheck())
			return NOT_FOUND_RETURN;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

}
