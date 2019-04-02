package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntLinkedList;

public class DefaultCountingOutRhymer {

    private Stackable stackable;

    public DefaultCountingOutRhymer(Stackable stackable) {
        this.stackable = stackable;
    }

    public DefaultCountingOutRhymer() {
        this.stackable = new IntLinkedList();
    }


    public void push(int in) {
        stackable.push(in);
    }

    public boolean isFull() {
        return stackable.isFull();
    }


    public int top() {
        return stackable.top();
    }

    public int pop() {
        return stackable.pop();
    }

    public boolean isEmpty() {
        return stackable.isEmpty();
    }
}