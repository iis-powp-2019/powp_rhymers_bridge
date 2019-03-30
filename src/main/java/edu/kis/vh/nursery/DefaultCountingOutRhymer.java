package edu.kis.vh.nursery;

import edu.kis.vh.nursery.storage.IntLinkedList;
import edu.kis.vh.nursery.storage.StackableInterface;

public class DefaultCountingOutRhymer {

    private final int STACK_EMPTY_SIZE = -1;
    StackableInterface stackableInterface;

    public DefaultCountingOutRhymer() {
        stackableInterface = new IntLinkedList();
    }

    public DefaultCountingOutRhymer(StackableInterface stackableInterface) {
        this.stackableInterface = stackableInterface;
    }

    public void countIn(int in) {
        stackableInterface.push(in);
    }

    public boolean callCheck() {
        return stackableInterface.isEmpty();
    }

    public boolean isFull() {
        return false;
    }

    public int peekaboo() {
        if(stackableInterface.isEmpty())
            return STACK_EMPTY_SIZE;
        return stackableInterface.top();
    }

    public int countOut() {
        return stackableInterface.pop();
    }
}


