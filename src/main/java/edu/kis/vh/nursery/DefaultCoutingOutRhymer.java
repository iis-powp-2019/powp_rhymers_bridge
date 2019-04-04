package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntArrayStack;

public class DefaultCoutingOutRhymer {
	private IntArrayStack intArrayStack;

	public DefaultCoutingOutRhymer(){
	    this.intArrayStack = new IntArrayStack();
    }

    public DefaultCoutingOutRhymer(IntArrayStack intArrayStack) {
        this.intArrayStack = intArrayStack;
    }

    public void countIn(int in) {
        intArrayStack.countIn(in);
    }

    public int countOut() {
        return intArrayStack.countOut();
    }

    public boolean callCheck() {
        return intArrayStack.callCheck();
    }

    public int peekaboo() {
        return intArrayStack.peekaboo();
    }

    public boolean isFull() {
        return intArrayStack.isFull();
    }
}
