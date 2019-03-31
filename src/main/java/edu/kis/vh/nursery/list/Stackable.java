package edu.kis.vh.nursery.list;

public interface Stackable {

    int top();

    void push(int i);

    int pop();

    boolean isEmpty();

    boolean isFull();
}
