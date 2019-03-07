package edu.kis.vh.nursery.list;

public class IntLinkedList {

	public Node last;
	private int i;
	private int size = 0;
	
	protected void push(int i) {
		if (last == null){
			last = new Node(i);
			size++;
		}		
		else {
			last.next = new Node(i);
			last.next.setPrev(last);
			last = last.next;
			size++;
		}
	}
	
	protected boolean isEmpty() {
		if(last == null) return true;
		else return false;
	}
	
	protected boolean isFull() {
		if(size == 12) return true;
		else return false;
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
		size--;
		return ret;
	}
	
	protected int getI() {
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
