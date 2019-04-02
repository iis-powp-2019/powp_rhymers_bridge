package edu.kis.vh.nursery;

import edu.kis.vh.nursery.ownStackImplementations.IntLinkedList;

public class DefaultCountingOutRhymer{
    private IIntStack iIntStack;

    public DefaultCountingOutRhymer() {
        this.iIntStack = new IntLinkedList();
    }

    public DefaultCountingOutRhymer(IIntStack iIntStack) {
        this.iIntStack = iIntStack;
    }

	public void countIn(int in) {
        iIntStack.push(in);
	}

	public boolean isFull() {
		return iIntStack.isFull();
	}

	public int countOut() {
		return iIntStack.pop();
	}

	public int peekaboo() {
		return iIntStack.peek();
	}

}
