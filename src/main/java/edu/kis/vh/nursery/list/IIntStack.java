package edu.kis.vh.nursery.list;

public interface IIntStack {
    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();
}
