package edu.kis.vh.nursery.list;

/**
 * class which implements element of own linkedList
 */
public class Node {

    //wszystkie settery używane

    private int value;
    private Node prev;
    private Node next;

    public Node(int i) {
        setValue(i);
    }

    /**
     *
     * @return value attribute
     */
    public int getValue() {
        return value;
    }

    /**
     *
     * @param value - value for creating new node object
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     *
     * @return previous Node object
     */
    public Node getPrev() {
        return prev;
    }

    /**
     *
     * @param prev - node object which is set as previous node in linkedList
     */
    public void setPrev(Node prev) {
        this.prev = prev;
    }

    /**
     *
     * @return next Node object
     */
    public Node getNext() {
        return next;
    }

    /**
     *
     * @param next node object which is set as next node in linkedList
     */
    public void setNext(Node next) {
        this.next = next;
    }
}
