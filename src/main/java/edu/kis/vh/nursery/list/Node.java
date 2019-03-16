package edu.kis.vh.nursery.list;

public class Node {

    private final int value;
    public Node prev, next;

    public Node(final int i) {
        value = i;
    }

    public int getValue() {
        return value;
    }

}
