package edu.kis.vh.nursery.list;

public class Node {

    private int value;
    private Node prev;
    private Node next;

    public Node(int i) {
        value = i;
    }

    protected int getValue() {
        return value;
    }

    protected void setValue(int value) {
        this.value = value;
    }

    protected Node getPrev() {
        return prev;
    }

    protected void setPrev(Node prev) {
        this.prev = prev;
    }

    protected Node getNext() {
        return next;
    }

    protected void setNext(Node next) {
        this.next = next;
    }

}
