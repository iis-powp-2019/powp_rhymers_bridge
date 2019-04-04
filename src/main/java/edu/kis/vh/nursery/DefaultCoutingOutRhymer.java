package edu.kis.vh.nursery;

import edu.kis.vh.nursery.Containers.*;
public class DefaultCoutingOutRhymer {
	private StackInterface stackInterface;

	public DefaultCoutingOutRhymer(){
	    this.stackInterface = new IntLinkedList();
    }

    public DefaultCoutingOutRhymer(IntLinkedList intLinkedList) {
        this.stackInterface = intLinkedList;
    }
    public DefaultCoutingOutRhymer(IntArrayStack intArrayStack) {
        this.stackInterface = intArrayStack;
    }

    public void countIn(int in) {
        stackInterface.countIn(in);
    }

    public int countOut() {
        return stackInterface.countOut();
    }

    public boolean callCheck() {
        return stackInterface.callCheck();
    }

    public int peekaboo() {
        return stackInterface.peekaboo();
    }

    public boolean isFull() {
        return stackInterface.isFull();
    }
}
