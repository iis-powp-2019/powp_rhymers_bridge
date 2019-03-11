package edu.kis.vh.nursery.list;

public class IntLinkedList {
    private class Node {

        private int value;
        private Node prev;
        private Node next;

        protected Node(final int i) {
            setValue(i);
        }

        public int getValue() {
            return value;
        }

        public void setValue(final int value) {
            this.value = value;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(final Node prev) {
            this.prev = prev;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(final Node next) {
            this.next = next;
        }
    }

    private static final int EMPTY = -1;
    private Node last;
    private int i;

    public void push(final int i) {
        if (getLast() == null)
            setLast(new Node(i));
        else {
            getLast().setNext(new Node(i));
            getLast().getNext().setPrev(getLast());
            setLast(getLast().getNext());
        }
    }

    public boolean isEmpty() {
        return getLast() == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return EMPTY;
        return getLast().getValue();
    }

    public int pop() {
        if (isEmpty())
            return EMPTY;
        int ret = getLast().getValue();
        setLast(getLast().getPrev());
        return ret;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(final Node last) {
        this.last = last;
    }

    public int getI() {
        return i;
    }


}
// alt+→ switch to the next open file in IDE
// alt+← switch to the previous open file in IDE