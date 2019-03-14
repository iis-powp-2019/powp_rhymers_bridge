package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private final int EMPTY_NODE_VALUE = -1;
    private Node last;

    public void push(int numberElement) {
        if (last == null)
            last = new Node(numberElement);
        else {
            last.setNext(new Node(numberElement));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return EMPTY_NODE_VALUE;
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return EMPTY_NODE_VALUE;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    class Node {

        private final int value;
        private Node prev, next;

        Node(int value) {
            this.value = value;
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
}
