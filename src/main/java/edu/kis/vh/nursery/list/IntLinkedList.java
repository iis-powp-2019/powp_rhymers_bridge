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
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

	public Node getLast() {
		return last;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

}

//alt + <- przechodzi do poprzednio edytowanego pliku, za każdym razem o jeden w tył
//alt + -> przechodzi do wcześniej edytowanego pliku, analogicznie o jeden w przód
