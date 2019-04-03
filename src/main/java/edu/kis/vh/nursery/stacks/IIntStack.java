package edu.kis.vh.nursery.stacks;

public interface IIntStack {
    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();
}
