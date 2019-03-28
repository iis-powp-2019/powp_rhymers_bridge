package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer {

    private IntLinkedList intArrayStack;

    public DefaultCountingOutRhymer() {
        intArrayStack = new IntLinkedList();
    }

    public DefaultCountingOutRhymer(IntLinkedList intArrayStack) {
        this.intArrayStack = intArrayStack;
    }


    public int getCurrentSize() {
        return intArrayStack.getCurrentSize();
    }

    public void countIn(int in) {
        intArrayStack.push(in);
    }

    public boolean callCheck() {
        return intArrayStack.isEmpty();
    }

    public boolean isFull() {
        return intArrayStack.isFull();
    }

    public int peekaboo() {
        return intArrayStack.top();
    }

    public int countOut() {
        return intArrayStack.pop();
    }


}
