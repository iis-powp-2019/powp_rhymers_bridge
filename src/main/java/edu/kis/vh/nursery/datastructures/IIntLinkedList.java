package edu.kis.vh.nursery.datastructures;

public interface IIntLinkedList {
    void push(int i);

    boolean isEmpty();

    //TODO: zawsze zwraca false
    boolean isFull();

    int top();

    int pop();
}
