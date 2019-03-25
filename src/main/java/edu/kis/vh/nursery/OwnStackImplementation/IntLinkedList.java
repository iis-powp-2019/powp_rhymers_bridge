package edu.kis.vh.nursery.OwnStackImplementation;

import edu.kis.vh.nursery.IntStack;

/**
 * class implements own linkedList
 */
public class IntLinkedList implements IntStack {

    private static final int EMPTY_POSITION = -1;
    private Node lastNode;

    /**
     * @param i - value for adding to OwnStackImplementation
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
     * @return boolen value from checking if OwnStackImplementation is empty
     */
    public boolean callCheck() {
        return lastNode == null;
    }


    /**
     * @return boolen value from checking if OwnStackImplementation is full
     */
    public boolean isFull() {
        return false;
    }

    /**
     * @return peekaboo value on the OwnStackImplementation
     */
    public int peekaboo() {
        if (callCheck()) {
            return EMPTY_POSITION;
        }
        return lastNode.getValue();
    }

    /**
     * @return peekaboo value on the OwnStackImplementation and remove it from OwnStackImplementation
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
