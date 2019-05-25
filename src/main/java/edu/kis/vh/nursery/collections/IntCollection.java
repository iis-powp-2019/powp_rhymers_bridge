package edu.kis.vh.nursery.collections;

public interface IntCollection {

    void push(int x);
    boolean isEmpty();
    boolean isFull();
    int top();
    int pop();
    int getElementCount();

}
