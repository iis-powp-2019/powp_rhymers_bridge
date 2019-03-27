package edu.kis.vh.nursery;

import edu.kis.vh.nursery.IntArrayStack;
import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer{
    private IntArrayStack intArrayStack;  

    public DefaultCountingOutRhymer() {
        // łthis.intArrayStack = new IntLinkedList();
    }

    public DefaultCountingOutRhymer(IntLinkedList intLinkedList) {
        this.intArrayStack = intLinkedList;
    }

	public void countIn(int in) {
		intArrayStack.countIn(in);
	}

	public boolean callCheck() {
		return intArrayStack.callCheck();
	}

	public boolean isFull() {
		return intArrayStack.isFull();
	}

	public int countOut() {
		return intArrayStack.countOut();
	}

	public int peekaboo() {
		return intArrayStack.peekaboo();
	}

}
