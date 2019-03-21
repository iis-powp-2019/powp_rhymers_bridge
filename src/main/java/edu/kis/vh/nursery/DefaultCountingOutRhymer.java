package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

/**
 * Basic rhymer type implementation
 */
public class DefaultCountingOutRhymer {


    private IntArrayStack intArrayStack;
    private IntLinkedList list;


    public DefaultCountingOutRhymer(IntArrayStack intArrayStack) {
        this.intArrayStack = intArrayStack;
    }
    public DefaultCountingOutRhymer() {
        this.intArrayStack = new IntArrayStack();
        this.list = new IntLinkedList();
    }


    public void push(int i) {
        list.push(i);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void countIn(int in) {
        intArrayStack.countIn(in);
    }

    public boolean callCheck() {
        return intArrayStack.callCheck();
    }

    public boolean isFull() {
        return intArrayStack.isFull();
    }

    public int top() {
        return list.top();
    }

    public int pop() {
        return list.pop();
    }

    public int peekaboo() {
        return intArrayStack.peekaboo();
    }

    public int countOut() {
        return intArrayStack.countOut();
    }
}
