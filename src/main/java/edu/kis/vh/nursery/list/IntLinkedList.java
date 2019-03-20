package edu.kis.vh.nursery.list;

public class IntLinkedList {

	private static final int EMPTY_STACK_TOP = -1;
	private Node last;
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
			return EMPTY_STACK_TOP;
		return last.getValue();
	}

	public int pop() {
		if (isEmpty())
			return EMPTY_STACK_TOP;
		final int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

	public Node getLast() {
		return last;
	}

	public int getI() {
		return i;
	}
	
	
	/**
	 * Nested class in class IntLinkedList
	 * @author monik
	 */
	class Node {

		private final int value;
		private Node prev;
		private Node next;

		/**
		 * Constructor
		 * @param i Variable assigned to the field value
		 */
		protected Node(int i) {
			value = i;
		}

		/**
		 * Returns node placed before this node in the stack
		 * @return Node
		 */
		protected Node getPrev() {
			return prev;
		}

		/**
		 * Assigns node which is next in the stack to the field prev
		 * @param prev
		 */
		protected void setPrev(Node prev) {
			this.prev = prev;
		}

		/**
		 * Returns node placed after this node in the stack
		 * @return Node
		 */
		protected Node getNext() {
			return next;
		}

		/**
		 * Assigns node which is next in the stack to the field next
		 * @param next 
		 */
		protected void setNext(Node next) {
			this.next = next;
		}

		/**
		 * Gets value of the node
		 * @return int
		 */
		protected int getValue() {
			return value;
		}

	}
}

//alt + <- przechodzi do poprzednio edytowanego pliku, za każdym razem o jeden w tył
//alt + -> przechodzi do wcześniej edytowanego pliku, analogicznie o jeden w przód
