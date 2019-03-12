package edu.kis.vh.nursery.list;


 class Node {

    public int getValue() {
        return value;
    }


    private int value;
    private Node prev, next;

    public Node(int i) {
        value = i;
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

public class IntLinkedList {

    private Node last;
    private int i;
    private static final int STACKEMPTY = -1;

    public static int getEMPTY() {
        return STACKEMPTY;
    }

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
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
            return STACKEMPTY;
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return STACKEMPTY;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    public Node getLast() {
        return last;
    }

    public int getI() {
        return i;
    }

}
