package edu.kis.vh.nursery.collections;

import edu.kis.vh.nursery.StackInterface;

public class IntLinkedList implements StackInterface {

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
			return StackInterface.INDEX;
		return last.getValue();
	}

	public int pop() {
		if (isEmpty())
			return StackInterface.INDEX;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}

	Node getLast() {
		return last;
	}

	int getI() {
		return i;
	}

	@Override
	public void countIn(int in) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int countOut() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean callCheck() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int peekaboo() {
		// TODO Auto-generated method stub
		return 0;
	}

}
