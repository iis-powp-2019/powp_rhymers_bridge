package edu.kis.vh.nursery.storage;

// TODO: Expanding documentation for Node class, checking IntLinkedList documentation

/**
 * Node class was imported into IntLikedList for commit 3.12
 */
class Node {

	public int getValue() {
		return value;
	}

	private int value;
	private Node prev, next;

	public Node(int i) {
		value = i;
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

public class IntLinkedList implements IntStorageInterface {

	private Node last;
	private int i;
	public static final int EMPTY_STACK = -1;
	private int size = 0;

	public static int getEMPTY() {
		return EMPTY_STACK;
	}

    /**
     *  Adding value to LinkedList
     * @param i will be added
     */

	@Override public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			size ++;
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

    /**
     * Checking whether LinkedList is empty or not
     * @return 'true' value if LinkedList is empty
     */
	@Override public boolean isEmpty() {
		return last == null;
	}

    /**
     * Checking whether LinkedList is full
     * @return false if it's not full
     */
	@Override public boolean isFull() {
		return false;
	}

    /**
     * Getting top element from the LinkedList
     * @return top element of the storage
     */
	@Override public int top() {
		if (isEmpty())
			return EMPTY_STACK;
		return last.getValue();
	}

    /**
     * Deleting top element from LinkedList
     * @return top element of the storage
     */
	@Override public int pop() {
		if (isEmpty())
			return EMPTY_STACK;
		size--;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

    /**
     * Getting last node of LinkedList
     * @return last node of the storage
     */
	@Override public Node getLast() {
		return last;
	}

    /**
     * Setting last node to the LinkedList
     * @param last is set as the last element node of the storage
     */
	@Override public void setLast(Node last) {
		this.last = last;
	}

    /**
     * Getting value from LinkedList
     * @return value added to the storage
     */
	public int getI() {
		return i;
	}

	public int getSize() {
		return size;
	}

}
