package edu.kis.vh.nursery.list;

/**
 * @author monik
 * @version 1.0
 * @since 2019-03-20
 */
public class Node {

	private final int value;
	private Node prev;
	private Node next;

	/**
	 * Constructor
	 * @param i Variable assigned to the field value
	 */
	public Node(int i) {
		value = i;
	}

	/**
	 * Returns node placed before this node in the stack
	 * @return Node
	 */
	public Node getPrev() {
		return prev;
	}

	/**
	 * Assigns node which is next in the stack to the field prev
	 * @param prev
	 */
	public void setPrev(Node prev) {
		this.prev = prev;
	}

	/**
	 * Returns node placed after this node in the stack
	 * @return Node
	 */
	public Node getNext() {
		return next;
	}

	/**
	 * Assigns node which is next in the stack to the field next
	 * @param next 
	 */
	public void setNext(Node next) {
		this.next = next;
	}

	/**
	 * Gets value of the node
	 * @return int
	 */
	public int getValue() {
		return value;
	}

}
