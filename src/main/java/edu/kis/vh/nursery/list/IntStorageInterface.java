package edu.kis.vh.nursery.list;

public interface IntStorageInterface {

    static int getEMPTY() {
        return IntLinkedList.STACKEMPTY;
    }

    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();

    Node getLast();

    void setLast(Node last);

    int getSize();
}
