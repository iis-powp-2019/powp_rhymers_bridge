package edu.kis.vh.nursery.stack;

public interface Stackable {

    int EMPTY_STACK_VALUE = -1;

    void push(int i);

    int getTotal();

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();
}
