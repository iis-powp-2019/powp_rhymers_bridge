package edu.kis.vh.nursery;

import edu.kis.vh.nursery.stack.IntegerLinkedList;

public class DefaultCountingOutRhymer {

    private Stackable stack;

    public DefaultCountingOutRhymer(Stackable stack) {
        this.stack = stack;
    }

    public DefaultCountingOutRhymer() {
        stack = new IntegerLinkedList();
    }

    public void countIn(int input) {
        stack.push(input);
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

    public int getTotal() {
        return stack.getTotal();
    }
}
