package edu.kis.vh.nursery.list;

/**
 * Stack of integers
 */
public class IntLinkedList implements Stackable {

	private static final int STACK_EMPTY = -1;
	/**
	 * Last value of the stack
	 */
	private Node last;

	private int total = STACK_EMPTY;
	//int i;

	@Override public int getTotal() {
		return total;
	}

	/**
	 * @param i element to be pushed
	 */
	@Override public void countIn(int i) {
		total++;
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
	@Override public boolean callCheck() {
		return last == null;
	}

	/**
	 * @return returns true if the stack is full, false if stack is not full
	 */
	@Override public boolean isFull() {
		return false;
	}

	/**
	 * @return returns the value of the value at the top of the stack if the stack is not empty. If the stack is empty it returns -1
	 */
	@Override public int peekaboo() {
		if (callCheck())
			return STACK_EMPTY;
		return last.getValue();
	}

	/**
	 * @return returns the value of the top of the stack and cuts it our of the stack. If the stack is empty it returns -1
	 */
	@Override public int countOut() {
		total--;
		if (callCheck())
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
