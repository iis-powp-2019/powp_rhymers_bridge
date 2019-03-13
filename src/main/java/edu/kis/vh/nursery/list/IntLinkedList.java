package edu.kis.vh.nursery.list;



public class IntLinkedList {

	private Node last;
	private int i;
	private static final int EMPTY_STACK = -1;

	public static int getEMPTY() {
		return EMPTY_STACK;
	}

    /**
     *  Adding value to LinkedList
     * @param i will be added
     */

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

    /**
     * Checking whether LinkedList is empty or not
     * @return 'true' value if LinkedList is empty
     */
	public boolean isEmpty() {
		return last == null;
	}

    /**
     * Checking whether LinkedList is full
     * @return false if it's not full
     */
	public boolean isFull() {
		return false;
	}

    /**
     * Getting top element from the LinkedList
     * @return top element of the list
     */
	public int top() {
		if (isEmpty())
			return EMPTY_STACK;
		return last.getValue();
	}

    /**
     * Deleting top element from LinkedList
     * @return top element of the list
     */
	public int pop() {
		if (isEmpty())
			return EMPTY_STACK;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

    /**
     * Getting last node of LinkedList
     * @return last node of the list
     */
	public Node getLast() {
		return last;
	}

    /**
     * Setting last node to the LinkedList
     * @param last is set as the last element node of the list
     */
	public void setLast(Node last) {
		this.last = last;
	}

    /**
     * Getting value from LinkedList
     * @return value added to the list
     */
	public int getI() {
		return i;
	}

}
