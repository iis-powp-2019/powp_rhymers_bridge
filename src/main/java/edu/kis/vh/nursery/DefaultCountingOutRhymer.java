package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import edu.kis.vh.nursery.list.IntStorageInterface;

public class DefaultCountingOutRhymer {
    IntStorageInterface intStorageInterface = new IntLinkedList();

    public DefaultCountingOutRhymer(){

    }

    public DefaultCountingOutRhymer(IntLinkedList intStorageInterface) {
        this.intStorageInterface = intStorageInterface;
    }

    public void countIn(int in) {
        //intArrayStack.countIn(in);
        intStorageInterface.push(in);
    }

    public boolean callCheck() {
        //return intArrayStack.callCheck();
        return intStorageInterface.isEmpty();
    }

    public boolean isFull() {
        //return intArrayStack.isFull();
        return intStorageInterface.isFull();
    }

    public int peekaboo() {
        //return intArrayStack.top();
        return intStorageInterface.top();
    }

    public int countOut() {
        //return intArrayStack.pop();
        return intStorageInterface.pop();
    }
}
