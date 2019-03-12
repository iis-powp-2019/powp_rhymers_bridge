package edu.kis.vh.nursery.list;


class IntLinkedList {
    private Node last;
    private int i;

    private void push(final int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    private boolean isEmpty() {
        return last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return -1;
        return last.value;
    }

    public int pop() {
        if (isEmpty())
            return -1;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

    public Node getLast() {
        return last;
    }

    private class Node {

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


}
