package edu.kis.vh.nursery.data_structure;

public interface DataStructure {

    int EMPTY = -1;

    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();

}
