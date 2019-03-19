package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int EMPTY = -1;
    private Node last;
    private int i;

    protected void push(int i) {
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

}
