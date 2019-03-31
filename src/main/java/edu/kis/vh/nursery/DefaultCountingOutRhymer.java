package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collection.IntArrayStack;
import edu.kis.vh.nursery.collection.IntLinkedList;
import edu.kis.vh.nursery.collection.Stack;

public class DefaultCountingOutRhymer {

    protected Stack intArrayStack = new IntLinkedList();

    public DefaultCountingOutRhymer(IntLinkedList intArrayStack) {
        this.intArrayStack = intArrayStack;
    }

    public DefaultCountingOutRhymer() {
    }

    public DefaultCountingOutRhymer(IntArrayStack intArrayStack) {

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

    protected int peekaboo() {
        return intArrayStack.top();
    }

    public int countOut() {
        return intArrayStack.pop();
    }

}
