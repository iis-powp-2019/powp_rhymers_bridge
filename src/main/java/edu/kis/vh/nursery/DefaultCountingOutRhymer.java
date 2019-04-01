package edu.kis.vh.nursery;

import edu.kis.vh.nursery.storage.IntLinkedList;
import edu.kis.vh.nursery.storage.Stack;

public class DefaultCountingOutRhymer {

    private Stack stack;

    public DefaultCountingOutRhymer() {
        this.stack = new IntLinkedList();
    }

    public DefaultCountingOutRhymer(Stack stack) {
        this.stack = stack;
    }

    public void countIn(int in) {
        stack.push(in);
    }

    public boolean callCheck() {
        return stack.isEmpty();
    }

    public boolean isFull() {
        return stack.isFull();
    }

    public int peekaboo() {
        return stack.top();
    }

    public int countOut() {
        return stack.pop();
    }
}
