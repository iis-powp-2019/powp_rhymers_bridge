package edu.kis.vh.nursery.containers;

public class Node {
    public static final int DEFAULT_INDEX = 0;


    public int getValue() {
        return value;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    private final int value;
    private Node prev, next;

    public Node(int i) {
        value = i;
    }

}
