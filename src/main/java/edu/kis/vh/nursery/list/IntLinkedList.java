package edu.kis.vh.nursery.list;

import edu.kis.vh.nursery.IIntRoot;

public class IntLinkedList implements IIntRoot{

	private static final int EMPTY = -1;
	private Node last;
	private int i;

	public boolean isFull() {
		return false;
	}

	@Override
	public void countIn(int in) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	@Override
	public int peekaboo() {
		if (callCheck())
			return EMPTY;
		
		return last.getValue();
	}

	@Override
	public int countOut() {
		if (callCheck())
			return EMPTY;
		
		final int ret = last.getValue();
		last = last.getPrev();
		
		return ret;
	}

	@Override
	public boolean callCheck() {
		return last == null;
	}

}
