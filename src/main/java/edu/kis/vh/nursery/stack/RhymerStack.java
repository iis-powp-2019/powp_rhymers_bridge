package edu.kis.vh.nursery.stack;

public interface RhymerStack {
    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();

    int getTotal();
}
