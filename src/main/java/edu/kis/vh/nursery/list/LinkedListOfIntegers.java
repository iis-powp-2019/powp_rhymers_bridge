package edu.kis.vh.nursery.list;

public class LinkedListOfIntegers {

    public static final int EMPTY_STACK_VALUE = -1;

    private int value;
    private Node last;

    public void push(int newNodeValue) {
        if (getLast() == null){
            setLast(new Node(newNodeValue));
        } else {
            getLast().setNext(new Node(newNodeValue));
            getLast().getNext().setPrevious(getLast());
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
        if (isEmpty()){
            return EMPTY_STACK_VALUE;
        }else{
            return getLast().getValue();
        }
    }

    public int pop() {
        if (isEmpty()){
            return EMPTY_STACK_VALUE;
        }

        int returningValue = getLast().getValue();
        setLast(getLast().getPrevious());
        return returningValue;
    }

    public int getValue() {
        return value;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }
}
