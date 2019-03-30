package edu.kis.vh.nursery.stack;

public interface Stack {

    int EMPTY_STACK_VALUE = -1;

    void push(int newNodeValue);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();
}
