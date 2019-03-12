package edu.kis.vh.nursery.list;

import edu.kis.vh.nursery.IntStack;

/**
 * class implements own linkedList
 */
public class IntLinkedList implements IntStack {

    private static final int EMPTY_POSITION = -1;
    private Node lastNode;

    /**
     * @param i - value for adding to list
     */
    public void countIn(int i) {
        if (lastNode == null) {
            lastNode = new Node(i);
        } else {
            lastNode.setNext(new Node(i));
            lastNode.getNext().setPrev(lastNode);
            lastNode = lastNode.getNext();
        }
    }

    /**
     * @return boolen value from checking if list is empty
     */
    public boolean callCheck() {
        return lastNode == null;
    }


    /**
     * @return boolen value from checking if list is full
     */
    public boolean isFull() {
        return false;
    }

    /**
     * @return peekaboo value on the list
     */
    public int peekaboo() {
        if (callCheck()) {
            return EMPTY_POSITION;
        }
        return lastNode.getValue();
    }

    /**
     * @return peekaboo value on the list and remove it from list
     */
    public int countOut() {
        if (callCheck()) {
            return EMPTY_POSITION;
        }
        int lastValueOnList = lastNode.getValue();
        lastNode = lastNode.getPrev();

        return lastValueOnList;
    }

}
