package edu.kis.vh.nursery;

public interface Stackable {

    void push(int value);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();

    int getTotal();
}
