package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer implements StackInterface {

	IntLinkedList linkedList;

	public DefaultCountingOutRhymer() {
		this.linkedList = new IntLinkedList();
	}

	public DefaultCountingOutRhymer(IntLinkedList linkedList) {
		this.linkedList = linkedList;
	}

	@Override
	public void countIn(int in) {
		linkedList.countIn(in);
	}

	@Override
	public int countOut() {
		return linkedList.countOut();
	}

	@Override
	public boolean callCheck() {
		return linkedList.callCheck();
	}

	@Override
	public int peekaboo() {
		return linkedList.peekaboo();
	}

	@Override
	public boolean isFull() {
		return linkedList.isFull();
	}
}
