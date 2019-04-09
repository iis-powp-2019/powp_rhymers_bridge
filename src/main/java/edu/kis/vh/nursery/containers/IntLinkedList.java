package edu.kis.vh.nursery.containers;

import edu.kis.vh.nursery.IStackInterface;

public class IntLinkedList implements IStackInterface{

	//obie klasy posiadają stałą EMPTY
	private static final int EMPTY = 0;
	private Node last;

	public boolean isFull() {
		return false;
	}

	@Override
	public void countIn(int in) {
		if (last == null) {
			last = new Node(in);
		}else {
			last.setNext(new Node(in));
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
