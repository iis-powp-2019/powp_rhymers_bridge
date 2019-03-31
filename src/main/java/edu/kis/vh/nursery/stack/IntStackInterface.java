package edu.kis.vh.nursery.stack;

public interface IntStackInterface {

    int EMPTY_STACK_INDEX = 0;

    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();
}
