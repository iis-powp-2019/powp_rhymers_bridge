package edu.kis.vh.nursery.stack;

/**
 * The Node class implements attributes and methods to properly operate on the them in the list
 * 
 * @author Leszek
 */
public class Node {

	/**
	 * value - value of the node
	 * prev - previous node
	 * next - next node
	 */
	
	private final int value;
	private Node prev;
	private Node next;

	/**
	 * This method allows to set value of the node
	 * @param i Value of the node
	 * @return Nothing.
	 */
	
	public Node(int i) {
		value = i;
	}

	/**
	 * This method allows to get value of the node
	 * @param Nothing.
	 * @return int Return value of the node
	 */
	
	protected int getValue() {
		return value;
	}

	/**
	 * This method allows to get pointer to the previous node 
	 * @param Nothing.
	 * @return Node Return previous node
	 */
	
	protected Node getPrev() {
		return prev;
	}

	/**
	 * This method allows to set pointer to the previous node 
	 * @param prev Used as a pointer to the previous node
	 * @return Nothing.
	 */
	
	protected void setPrev(Node prev) {
		this.prev = prev;
	}

	/**
	 * This method allows to get pointer to the next node 
	 * @param Nothing.
	 * @return Node Return next node
	 */
	
	protected Node getNext() {
		return next;
	}
	
	/**
	 * This method allows to set pointer to the next node 
	 * @param next Used as a pointer to the next node
	 * @return Nothing
	 */
	
	protected void setNext(Node next) {
		this.next = next;
	}
	
}
