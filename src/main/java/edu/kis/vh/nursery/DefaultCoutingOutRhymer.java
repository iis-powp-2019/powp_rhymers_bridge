package edu.kis.vh.nursery;

import edu.kis.vh.nursery.Containers.*;
public class DefaultCoutingOutRhymer {
	private StackInterface stackInterface;

	public DefaultCoutingOutRhymer(){
	    this.stackInterface = new IntLinkedList();
    }

    public DefaultCoutingOutRhymer(StackInterface stack) {
	    this.stackInterface = stack;
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
