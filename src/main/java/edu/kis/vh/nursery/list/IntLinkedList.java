package edu.kis.vh.nursery.list;

public class IntLinkedList {

    public static final int EMPTY_STACK_VALUE = -1;

    int i;
    private Node last;

    public void push(int newNodeValue) {
        if (last == null){
            last = new Node(newNodeValue);
        } else {
            last.next = new Node(newNodeValue);
            last.next.previous = last;
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
        if (isEmpty()){
            return EMPTY_STACK_VALUE;
        }else{
            return last.value;
        }
    }

    public int pop() {
        if (isEmpty()){
            return EMPTY_STACK_VALUE;
        }

        int returningValue = last.value;
        last = last.previous;
        return returningValue;
    }

}
