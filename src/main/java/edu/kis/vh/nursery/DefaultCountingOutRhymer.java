package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collection.IntCollection;
import edu.kis.vh.nursery.collection.IntLinkedList;

/**
 * Class of default type rhymer
 */
public class DefaultCountingOutRhymer {

    private IntCollection stack;

    public DefaultCountingOutRhymer() {
        this.stack = new IntLinkedList();
    }

    public DefaultCountingOutRhymer(IntCollection stack) {
        this.stack = stack;
    }

    public int getTotal() {
        return stack.getElementCount();
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
