package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer implements Stackable{

    private IntLinkedList intLinkedList;

    public DefaultCountingOutRhymer(IntLinkedList intLinkedList) {
        this.intLinkedList = intLinkedList;
    }

    public DefaultCountingOutRhymer() {
        this.intLinkedList = new IntLinkedList();
    }

    public void push(int in) {
        intLinkedList.push(in);
    }

    public boolean callCheck() {
        return intLinkedList.isEmpty();
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (callCheck())
            return NO_ANY_ELEMENTS;
        return intLinkedList.top();
    }

    public int pop() {
        if (callCheck())
            return NO_ANY_ELEMENTS;
        return intLinkedList.pop();
    }
}
