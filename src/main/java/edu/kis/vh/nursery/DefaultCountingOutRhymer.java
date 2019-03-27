package edu.kis.vh.nursery;

import edu.kis.vh.nursery.IIntStack;
import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer{
    private IIntStack intArrayStack;  

    public DefaultCountingOutRhymer() {
        this.intArrayStack = new IntLinkedList();
    }

    public DefaultCountingOutRhymer(IntLinkedList intLinkedList) {
        this.intArrayStack = intLinkedList;
    }

	public void countIn(int in) {
		intArrayStack.push(in);
	}

	public boolean isFull() {
		return intArrayStack.isFull();
	}

	public int countOut() {
		return intArrayStack.pop();
	}

	public int peekaboo() {
		return intArrayStack.peek();
	}

}
