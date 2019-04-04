package edu.kis.vh.nursery.RhymersStacks;

public interface IntLinkedListInterface {

    int STACK_EMPTY = 0;

    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();
}
