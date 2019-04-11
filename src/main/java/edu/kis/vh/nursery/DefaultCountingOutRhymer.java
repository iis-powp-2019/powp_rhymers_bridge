package edu.kis.vh.nursery;

import edu.kis.vh.nursery.container.IntArrayStack;
import edu.kis.vh.nursery.container.IntLinkedList;

public class DefaultCountingOutRhymer implements StackInterface {

	StackInterface stackInterface;

	public DefaultCountingOutRhymer(StackInterface stack) {
		this.stackInterface = stack;
	}

	public DefaultCountingOutRhymer(IntLinkedList linkedList) {
		this.stackInterface = linkedList;
	}
	
	public DefaultCountingOutRhymer(IntArrayStack s) {
		this.stackInterface = s;
	}
	
	public DefaultCountingOutRhymer() {
        this.stackInterface = new IntArrayStack();
    }

	@Override
	public void countIn(int in) {
		stackInterface.countIn(in);
	}

	@Override
	public int countOut() {
		return stackInterface.countOut();
	}

	@Override
	public boolean callCheck() {
		return stackInterface.callCheck();
	}

	@Override
	public int peekaboo() {
		return stackInterface.peekaboo();
	}

	@Override
	public boolean isFull() {
		return stackInterface.isFull();
	}
}
