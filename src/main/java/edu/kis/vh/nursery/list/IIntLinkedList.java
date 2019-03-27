package edu.kis.vh.nursery.list;

public interface IIntLinkedList {
    void push(int i);

    boolean isEmpty();

    //TODO: zawsze zwraca false
    boolean isFull();

    int top();

    int pop();
}
