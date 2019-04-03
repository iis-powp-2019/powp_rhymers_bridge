package edu.kis.vh.nursery.collection;

public interface Stackable {

    int top();

    void push(int i);

    int pop();

    boolean isEmpty();

    boolean isFull();
}
