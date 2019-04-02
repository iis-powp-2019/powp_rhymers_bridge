package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collection.IntLinkedList;
import edu.kis.vh.nursery.collection.Stackable;

public class DefaultCountingOutRhymer {
    private Stackable stackable;

    private final int COLLECTION_EMPTY_SIZE=0;

    public DefaultCountingOutRhymer() {
        stackable = new IntLinkedList();
    }

    public DefaultCountingOutRhymer(Stackable stackable) {
        this.stackable = stackable;
    }

    public void countIn(int in) {
        stackable.push(in);
    }

    public boolean callCheck() {
        return stackable.isEmpty();
    }

    public boolean isFull() {
        return false;
    }

    public int peekaboo() {
        if(stackable.isEmpty())
            return COLLECTION_EMPTY_SIZE;
        return stackable.top();
    }

    public int countOut() {
        return stackable.pop();
    }
}
