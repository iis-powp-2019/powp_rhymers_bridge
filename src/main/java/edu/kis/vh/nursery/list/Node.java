package edu.kis.vh.nursery.list;

class Node {

    private int value;
    private Node prev;
    private Node next;

    Node(final int i) {
        setValue(i);
    }

    int getValue() {
        return value;
    }

    private void setValue(final int value) {
        this.value = value;
    }

    Node getPrev() {
        return prev;
    }

    void setPrev(final Node prev) {
        this.prev = prev;
    }

    Node getNext() {
        return next;
    }

    void setNext(final Node next) {
        this.next = next;
    }
}
