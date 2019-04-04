package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntArrayStack;
import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCoutingOutRhymer {
	private IntLinkedList intLinkedList;

	public DefaultCoutingOutRhymer(){
	    this.intLinkedList = new IntLinkedList();
    }

    public DefaultCoutingOutRhymer(IntLinkedList intLinkedList) {
        this.intLinkedList = intLinkedList;
    }

    public void countIn(int in) {
        intLinkedList.countIn(in);
    }

    public int countOut() {
        return intLinkedList.countOut();
    }

    public boolean callCheck() {
        return intLinkedList.callCheck();
    }

    public int peekaboo() {
        return intLinkedList.peekaboo();
    }

    public boolean isFull() {
        return intLinkedList.isFull();
    }
}
