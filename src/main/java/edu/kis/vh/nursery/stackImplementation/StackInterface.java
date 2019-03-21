package edu.kis.vh.nursery.stackImplementation;

public interface StackInterface {

    int EMPTY = 0;

    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();
}
