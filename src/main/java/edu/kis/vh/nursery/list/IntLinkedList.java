package edu.kis.vh.nursery.list;

/**
 *  class implements own linkedList
 */
public class IntLinkedList {

    private static final int EMPTY_POSITION = -1;
    private Node lastNode;
    //martwa zmienna

    /**
     *
     * @param i - value for adding to list
     */
    public void push(int i) {
        if (lastNode == null) {
            lastNode = new Node(i);
        } else {
            lastNode.setNext(new Node(i));
            lastNode.getNext().setPrev(lastNode);
            lastNode = lastNode.getNext();
        }
    }

    /**
     *
     * @return boolen value from checking if list is empty
     */
    public boolean isEmpty() {
        return lastNode == null;
    }


    /**
     *
     * @return boolen value from checking if list is full
     */
    public boolean isFull() {
        return false;
    }

    /**
     *
     * @return top value on the list
     */
    public int top() {
        if (isEmpty()) {
            return EMPTY_POSITION;
        }
        return lastNode.getValue();
    }

    /**
     *
     * @return top value on the list and remove it from list
     */
    public int pop() {
        if (isEmpty()) {
            return EMPTY_POSITION;
        }
        int lastValueOnList = lastNode.getValue();
        lastNode = lastNode.getPrev();

        return lastValueOnList;
    }

}
