package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntStorage;

public class DefaultCountingOutRhymer {
    IntArrayStack intArrayStack = new IntArrayStack();
    IntStorage intLinkedList = new IntStorage();

    public DefaultCountingOutRhymer(){

    }

    public DefaultCountingOutRhymer(IntStorage intLinkedList) {
        this.intLinkedList = intLinkedList;
    }

    public void countIn(int in) {
        //intArrayStack.countIn(in);
        intLinkedList.push(in);
    }

    public boolean callCheck() {
        //return intArrayStack.callCheck();
        return intLinkedList.isEmpty();
    }

    public boolean isFull() {
        //return intArrayStack.isFull();
        return intLinkedList.isFull();
    }

    public int peekaboo() {
        //return intArrayStack.top();
        return intLinkedList.top();
    }

    public int countOut() {
        //return intArrayStack.pop();
        return intLinkedList.pop();
    }
}
