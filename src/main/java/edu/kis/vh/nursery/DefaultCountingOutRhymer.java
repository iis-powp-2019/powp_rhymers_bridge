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

    @Override
    public void push(int in) {
        intLinkedList.push(in);
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int top() {
        if (isEmpty())
            return NO_ANY_ELEMENTS;
        return intLinkedList.top();
    }

    @Override
    public int pop() {
        if (isEmpty())
            return NO_ANY_ELEMENTS;
        return intLinkedList.pop();
    }

    @Override
    public boolean isEmpty() {
        return intLinkedList.isEmpty();
    }
}