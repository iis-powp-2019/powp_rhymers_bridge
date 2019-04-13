package edu.kis.vh.nursery;

import edu.kis.vh.nursery.storage.IntLinkedList;
import edu.kis.vh.nursery.storage.IntStorageInterface;

public class DefaultCountingOutRhymer {

    IntStorageInterface intStorageInterface = new IntLinkedList();

    public DefaultCountingOutRhymer(IntStorageInterface intStorageInterface) {
        this.intStorageInterface = intStorageInterface;
    }

    public DefaultCountingOutRhymer(){
        this.intStorageInterface = null;
    }

    public int getTotal() {
        return intStorageInterface.getSize();
    }

    public void countIn(int in) {
        intStorageInterface.push(in);
    }

    public boolean callCheck() {
        return intStorageInterface.isEmpty();
    }

    public boolean isFull() {
        return intStorageInterface.isFull();

    }

    public int peekaboo() {
        return intStorageInterface.top();
    }

    public int countOut() {
        return intStorageInterface.pop();
    }

}
