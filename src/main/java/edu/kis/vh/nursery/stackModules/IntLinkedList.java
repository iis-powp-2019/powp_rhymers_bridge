package edu.kis.vh.nursery.stackModules;

/**
 * This class is mainly made for creating a list that contains various nodes
 */
public class IntLinkedList implements Data{

    private Node last;
    private static final int EMPTY_INDEX = 0;

    @Override
    public void countIn(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * This method checks if the list is empty
     * @return true if the list is empty or false if it is not
     */

    @Override
    public boolean callCheck() {
        return last == null;
    }

    /**
     * This method checks if the the list full
     * @return always false
     */
    @Override
    public boolean isFull() {
        return false;
    }

    /**
     * This method returns the top value
     * @return the value of the last element or -1 if the list is empty
     */
    @Override
    public int peekaboo(){
        if (callCheck())
            return EMPTY_INDEX;
        return last.getValue();
    }

    /**
     * This method delete element from the list
     * @return the value of the element that was deleted or -1 if the list is empty
     */
    @Override
    public int countOut() {
        if (callCheck())
            return EMPTY_INDEX;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
