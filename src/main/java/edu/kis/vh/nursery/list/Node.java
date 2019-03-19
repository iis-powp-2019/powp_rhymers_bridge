package edu.kis.vh.nursery.list;

/**
 * @author Paweł
 *
 */
public class Node {

    /**
     * value of current Node
     */
    private int value;
    /**
     * class which indicate next Node
     */
    private Node prev;
    /**
     * class which indicate previous Node
     */
    private Node next;

    public Node(int i) {
        value = i;
    }

    /**
     * @return value of current Node
     */
    protected int getValue() {
        return value;
    }

    /**
     * @param value
     *            value which we want to set to current Node
     */
    protected void setValue(int value) {
        this.value = value;
    }

    /**
     * @return class with previous Node
     */
    protected Node getPrev() {
        return prev;
    }

    /**
     * @param prev
     *            set the previous Node to current Node
     */
    protected void setPrev(Node prev) {
        this.prev = prev;
    }

    /**
     * @return the next Node
     */
    protected Node getNext() {
        return next;
    }

    /**
     * @param next
     *            set the next Node to current Node
     */
    protected void setNext(Node next) {
        this.next = next;
    }

}
