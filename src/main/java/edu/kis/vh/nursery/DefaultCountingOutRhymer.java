package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntArrayStack;

public class DefaultCountingOutRhymer {
    IntArrayStack intArrayStack;

    public DefaultCountingOutRhymer(){
        intArrayStack = new IntArrayStack();
    }

    public DefaultCountingOutRhymer(IntArrayStack intArrayStack) {
        this.intArrayStack = intArrayStack;
    }

    public int peekaboo(){
        return intArrayStack.peekaboo();
    }

    public int getTotal() {
        return intArrayStack.getTotal();
    }

    public void countIn(int in) {
        intArrayStack.countIn(in);
    }

    public boolean isCheck() {
        return intArrayStack.isCheck();
    }

    public boolean isFull() {
        return intArrayStack.isFull();
    }

    public int countOut() {
        return intArrayStack.countOut();
    }
}
