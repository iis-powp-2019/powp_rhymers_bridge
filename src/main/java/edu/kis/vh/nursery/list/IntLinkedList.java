package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int EMPTY_LIST_VALUE = 0;
    private Node last;
    private int i;
    private int total = 0;

    public void push(int i) {
        if (last == null) {
            last = new Node(i);
        } else {
            total++;
            last.setNext(new Node(i));
            last.getNext()
                .setPrev(last);
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
        if (isEmpty()) {
            return EMPTY_LIST_VALUE;
        }
        return last.getValue();
    }

    public int pop() {
        if (isEmpty()) {
            return EMPTY_LIST_VALUE;
        }
        total--;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    public int getTotal() {
        return total;
    }

    private class Node {

        private final int value;
        private Node prev, next;

        public Node(final int i) {
            value = i;
        }

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

    }
}
