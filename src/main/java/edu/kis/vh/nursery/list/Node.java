package edu.kis.vh.nursery.list;

public class Node {

    final int value;
    Node prev;
    Node next;

    Node(final int i) {
        value = i;
    }

    public int getValue() {
        return value;
    }

    public Node getPrev() {
        return prev;
    }

    public Node getNext() {
        return next;
    }

}
