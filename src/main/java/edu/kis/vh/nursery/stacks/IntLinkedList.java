package edu.kis.vh.nursery.stacks;

public class IntLinkedList implements IIntStack {

    private Node last;
    private int i;

    @Override
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    @Override
    public boolean isEmpty() {
        return last == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int top() {
        if (isEmpty())
            return ERROR_CODE;
        return last.getValue();
    }

    @Override
    public int pop() {
        if (isEmpty())
            return ERROR_CODE;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

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