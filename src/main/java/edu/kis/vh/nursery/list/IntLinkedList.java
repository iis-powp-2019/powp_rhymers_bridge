package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int EMPTY = -1;
    private Node last;
    private int i;

    protected void push(final int i) {
        if (last == null) {
            last = new Node(i);
        } else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    protected boolean isEmpty() {
        return last == null;
    }

    protected boolean isFull() {
        return false;
    }

    protected int top() {
        if (isEmpty()) {
            return EMPTY;
        }
        return last.getValue();
    }

    protected int pop() {
        if (isEmpty()) {
            return EMPTY;
        }
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

	protected int getI() {
		return i;
	}

	protected void setI(int i) {
		this.i = i;
	}
	
	private class Node {

	    private final int value;
	    private Node prev;
		private Node next;

	    protected Node(final int i) {
	        value = i;
	    }

		public int getValue() {
			return value;
		}

		public Node getPrev() {
			return prev;
		}

		public void setPrev(final Node prev) {
			this.prev = prev;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(final Node next) {
			this.next = next;
		}

	}
}
