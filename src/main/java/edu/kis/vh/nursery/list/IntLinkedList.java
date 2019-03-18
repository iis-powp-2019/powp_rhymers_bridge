package edu.kis.vh.nursery.list;

/**
 * Stack of integers
 */
public class IntLinkedList {

	private static final int STACK_EMPTY = -1;
	/**
	 * Last value of the stack
	 */
	private Node last;
	//int i;

	/**
	 * @param i element to be pushed
	 */
	private void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}


	/**
	 * @return returns true if the stack is empty, false if stack is not empty
	 */
	private boolean isEmpty() {
		return last == null;
	}

	/**
	 * @return returns true if the stack is full, false if stack is not full
	 */
	private boolean isFull() {
		return false;
	}

	/**
	 * @return returns the value of the value at the top of the stack if the stack is not empty. If the stack is empty it returns -1
	 */
	private int top() {
		if (isEmpty())
			return STACK_EMPTY;
		return last.getValue();
	}

	/**
	 * @return returns the value of the top of the stack and cuts it our of the stack. If the stack is empty it returns -1
	 */
	private int pop() {
		if (isEmpty())
			return STACK_EMPTY;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

}

class Node {

	private int value;
	private Node prev;
	private Node next;

	public Node(int i) {
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