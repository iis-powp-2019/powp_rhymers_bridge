package edu.kis.vh.nursery.list;

class Node {

    public int getValue() {
        return value;
    }

    protected int value;
    protected Node prev, next;

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

public class IntLinkedList {

    private static final int DEFAULT_INDEX = -1;
    Node last;
	int i;

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
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
			return DEFAULT_INDEX;
		return last.value;
	}

	public int pop() {
		if (isEmpty())
			return DEFAULT_INDEX;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

}
