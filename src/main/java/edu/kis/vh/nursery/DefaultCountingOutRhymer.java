package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collections.Collections;
import edu.kis.vh.nursery.collections.IntLinkedList;

public class DefaultCountingOutRhymer {

    protected Collections collection;

    public DefaultCountingOutRhymer() {
        collection = new IntLinkedList();
    }

    public DefaultCountingOutRhymer(Collections intArrayStack) {
        this.collection = intArrayStack;
    }


    public int getCurrentSize() {
        return collection.getCurrentSize();
    }

    public void countIn(int in) {
        collection.push(in);
    }

    public boolean callCheck() {
        return collection.isEmpty();
    }

    public boolean isFull() {
        return collection.isFull();
    }

    public int peekaboo() {
        return collection.top();
    }

    public int countOut() {
        return collection.pop();
    }


}
