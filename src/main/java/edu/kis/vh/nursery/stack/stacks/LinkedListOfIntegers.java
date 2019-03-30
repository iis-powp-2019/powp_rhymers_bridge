package edu.kis.vh.nursery.stack.stacks;

import edu.kis.vh.nursery.stack.Stack;

class Node {

    private final int value;
    private Node previous;
    private Node next;

    Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

public class LinkedListOfIntegers implements Stack {

    private Node last;

    @Override public void push(int newNodeValue) {
        if (getLast() == null){
            setLast(new Node(newNodeValue));
        } else {
            getLast().setNext(new Node(newNodeValue));
            getLast().getNext().setPrevious(getLast());
            setLast(getLast().getNext());
        }
    }

    @Override public boolean isEmpty() {
        return getLast() == null;
    }

    @Override public boolean isFull() {
        return false;
    }

    @Override public int top() {
        if (isEmpty()){
            return EMPTY_STACK_VALUE;
        }else{
            return getLast().getValue();
        }
    }

    @Override public int pop() {
        if (isEmpty()){
            return EMPTY_STACK_VALUE;
        }

        int returningValue = getLast().getValue();
        setLast(getLast().getPrevious());
        return returningValue;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }
}
