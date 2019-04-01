package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private class Node {

        private int value;
        private Node prevNode;
        private Node nextNode;

        Node(int i) {
            setValue(i);
        }

        int getValue() {
            return value;
        }

        void setValue(int value) {
            this.value = value;
        }

        Node getPrevNode() {
            return prevNode;
        }

        void setPrevNode(Node prevNode) {
            this.prevNode = prevNode;
        }

        Node getNextNode() {
            return nextNode;
        }

        void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }
    }


    public static final int EMPTY_VALUE = -1;
    private Node lastNode;

    public void push(int i) {
        if (lastNode == null)
            lastNode = new Node(i);
        else {
            lastNode.setNextNode(new Node(i));
            lastNode.getNextNode().setPrevNode(lastNode);
            lastNode = lastNode.getNextNode();
        }
    }

    public boolean isEmpty() {
        return lastNode == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return EMPTY_VALUE;

        return lastNode.getValue();
    }

    public int pop() {
        if (isEmpty())
            return EMPTY_VALUE;

        int ret = lastNode.getValue();
        lastNode = lastNode.getPrevNode();

        return ret;
    }

}
