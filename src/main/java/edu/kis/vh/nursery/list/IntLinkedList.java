package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int EMPTY_LIST_VALUE = -1;
    private Node last;
    private int i;

    public void push(int i) {
        if (last == null) {
            last = new Node(i);
        } else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
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
        int ret = last.getValue();
        last = last.prev;
        return ret;
    }

    private class Node {

        private final int value;
        public Node prev, next;

        public Node(final int i) {
            value = i;
        }

        public int getValue() {
            return value;
        }

    }
}
