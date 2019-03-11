package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private static final int EMPTY_POSITION = -1;
    private Node lastNode;
    //martwa zmienna

    public void push(int i) {
        if (lastNode == null) {
            lastNode = new Node(i);
        } else {
            lastNode.setNext(new Node(i));
            lastNode.getNext().setPrev(lastNode);
            lastNode = lastNode.getNext();
        }
    }

    public boolean isEmpty() {
        return lastNode == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty()) {
            return EMPTY_POSITION;
        }
        return lastNode.getValue();
    }

    public int pop() {
        if (isEmpty()) {
            return EMPTY_POSITION;
        }
        int lastValueOnList = lastNode.getValue();
        lastNode = lastNode.getPrev();

        return lastValueOnList;
    }

}
