package edu.kis.vh.nursery.structures;
// TODO Unused class, make usage of it.
public class IntLinkedList implements LinkedListInterface {

    private static final int RETURN_VALUE = -1;
    private Node last;

    @Override
    public void push(int i) {
        if (getLast() == null)
            setLast(new Node(i));
        else {
            getLast().setNext(new Node(i));
            getLast().getNext().setPrev(getLast());
            setLast(getLast().getNext());
        }
    }

    @Override
    public boolean isEmpty() {
        return getLast() == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int top() {
        if (isEmpty())
            return RETURN_VALUE;
        return getLast().getValue();
    }

    @Override
    public int pop() {
        if (isEmpty())
            return RETURN_VALUE;
        int ret = getLast().getValue();
        setLast(getLast().getPrev());
        return ret;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    class Node {

        private int value;
        private Node prev;
        private Node next;

        public Node(int i) {
            setValue(i);
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
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
