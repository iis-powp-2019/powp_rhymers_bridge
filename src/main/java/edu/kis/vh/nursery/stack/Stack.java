package edu.kis.vh.nursery.stack;

public interface Stack {

    void push(int newNodeValue);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();
}
