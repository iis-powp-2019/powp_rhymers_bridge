package edu.kis.vh.nursery.stack;

public class IntLinkedList{

	//rivate static final int EMPTY_STACK_TOP = -1;
	private Node last;

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

	public int top(int emptyRetVal) {
		if (isEmpty())
			return emptyRetVal;
		return last.getValue();
	}

	public int pop(int emptyRetVal) {
		if (isEmpty())
			return emptyRetVal;
		final int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

	public Node getLast() {
		return last;
	}
	
	/**
	 * Nested class in class IntLinkedList
	 * @author monik
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
}
