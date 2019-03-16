package edu.kis.vh.nursery.list;

class Node {

    private final int value;
    private Node prev, next;

    Node(int i) {
        value = i;
    }

    int getValue() {
        return value;
    }


    Node getPrev() {
        return prev;
    }

    void setPrev(Node prev) {
        this.prev = prev;
    }

    Node getNext() {
        return next;
    }

    void setNext(Node next) {
        this.next = next;
    }
}
