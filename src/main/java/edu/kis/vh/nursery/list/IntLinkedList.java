package edu.kis.vh.nursery.list;

public class IntLinkedList {

	private static final int EMPTY_INDEX = -1;
	private Node last;
	private int total = EMPTY_INDEX;

	public void countIn(int i) {
		total++;
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	public boolean callCheck() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int peekaboo() {
		if (callCheck())
			return EMPTY_INDEX;
		return last.getValue();
	}

	public int countOut() {
		total--;
		if (callCheck())
			return EMPTY_INDEX;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

	public int getTotal() {
		return total;
	}

}

class Node {

	private final int value;
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
