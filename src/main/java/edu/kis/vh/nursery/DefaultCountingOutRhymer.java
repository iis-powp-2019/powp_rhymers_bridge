package edu.kis.vh.nursery;

import edu.kis.vh.nursery.storage.IntLinkedList;
import edu.kis.vh.nursery.storage.IntStorage;


public class DefaultCountingOutRhymer {

    public IntStorage intStorage;

    public DefaultCountingOutRhymer(IntStorage intStorage) {
        this.intStorage = intStorage;
    }

    public DefaultCountingOutRhymer(){
        intStorage = new IntLinkedList();
    }

    void countIn(int in) {
        intStorage.push(in);
    }

    boolean callCheck() { return intStorage.isEmpty(); }

    boolean isFull() {
        return intStorage.isFull();
    }

    int peekaboo() { return intStorage.top(); }

    int countOut() { return intStorage.pop(); }
}
