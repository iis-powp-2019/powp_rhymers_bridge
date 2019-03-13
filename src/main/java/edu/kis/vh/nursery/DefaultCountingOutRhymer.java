package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer {
    protected IntLinkedList intArrayStack = new IntLinkedList();

    public DefaultCountingOutRhymer() {

    }

    public DefaultCountingOutRhymer(IntLinkedList intArrayStack) {
        this.intArrayStack = intArrayStack;
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

    public int countOut() { return intArrayStack.pop();
    }

}
