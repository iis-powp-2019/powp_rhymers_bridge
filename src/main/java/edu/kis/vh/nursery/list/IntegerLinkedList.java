package edu.kis.vh.nursery.list;

import edu.kis.vh.nursery.Stackable;

public class IntegerLinkedList implements Stackable {

    private static final int EMPTY_LIST_VALUE = -1;
    private Node lastNode;
    private int total = EMPTY_LIST_VALUE;

    @Override
    public void push(final int value) {
        if (lastNode == null)
            lastNode = new Node(value);
        else {
            lastNode.setNextNode(new Node(value));
            lastNode.getNextNode().setPreviousNode(lastNode);
            lastNode = lastNode.getNextNode();
        }
        total++;
    }

    @Override
    public boolean isEmpty() {
        return lastNode == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int top() {
        if (isEmpty())
            return EMPTY_LIST_VALUE;
        return lastNode.getValue();
    }

    @Override
    public int pop() {
        if (isEmpty())
            return EMPTY_LIST_VALUE;
        int returningValue = lastNode.getValue();
        lastNode = lastNode.getPreviousNode();
        total--;
        return returningValue;
    }

    @Override
    public int getTotal() {
        return total;
    }

}

class Node {

    private final int value;
    private Node previousNode;
    private Node nextNode;

    Node(final int value) {
        this.value = value;
    }

    int getValue() {
        return value;
    }

    Node getPreviousNode() {
        return previousNode;
    }

    void setPreviousNode(Node previousNode) {
        this.previousNode = previousNode;
    }

    Node getNextNode() {
        return nextNode;
    }

    void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
