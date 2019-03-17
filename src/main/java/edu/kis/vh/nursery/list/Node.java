package edu.kis.vh.nursery.list;

public class Node {

    private int value;
    private Node prev;
    private Node next;

    public Node(int i) {
        value = i;
    }

    int getValue() {
        return value;
    }

    void setValue(int value) {
        this.value = value;
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
