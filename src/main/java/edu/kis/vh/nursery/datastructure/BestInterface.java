package edu.kis.vh.nursery.datastructure;

public interface BestInterface {
    int Empty_value = -1;

    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();
}
