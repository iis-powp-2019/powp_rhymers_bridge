package edu.kis.vh.nursery.list;

public interface RhymerStack {
    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();

    int getTotal();
}
