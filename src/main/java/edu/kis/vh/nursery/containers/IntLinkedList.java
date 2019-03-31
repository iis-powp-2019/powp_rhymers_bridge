package edu.kis.vh.nursery.containers;

import edu.kis.vh.nursery.IntStack;

public class IntLinkedList  implements IntStack {

	private static final int EMPTY = -1;
	private Node last;
	
	//TODO: remove unused variable
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
			return EMPTY;
		return last.getValue();
	}

	public int pop() {
		if (isEmpty())
			return EMPTY;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}
	
	private int total = EMPTY;
	
	@Override
	public int getTotal() {
		// TODO Auto-generated method stub
		return total;
	}

	@Override
	public void countIn(int in) {
		push(in);
		total++;
	}

	@Override
	public boolean callCheck() {
		return isEmpty();
	}

	@Override
	public int peekAboo() {
		return top();
	}

	@Override
	public int countOut() {
		total--;
		return pop();
	}
	
}

class Node {

	private final int value;
	private Node prev;
	private Node next;

	public Node(int i) {
		value = i;
	}

	protected int getValue() {
		return value;
	}

	protected Node getPrev() {
		return prev;
	}

	protected void setPrev(Node prev) {
		this.prev = prev;
	}

	protected Node getNext() {
		return next;
	}

	protected void setNext(Node next) {
		this.next = next;
	}

}
