package edu.kis.vh.nursery;

public interface Stackable {
    void push(int i);

    int getTotal();

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();
}
