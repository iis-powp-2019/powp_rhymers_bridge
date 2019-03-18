package edu.kis.vh.nursery.list;

class Node {

    protected int value;
    protected Node prev, next;

    /**
     * Getting value of Node
     *
     * @return value of Node
     */
    public int getValue() {
        return value;
    }

    /**
     * Constructor of Node with 1 param
     *
     * @param i - value to add
     */
    public Node(int i) {
        value = i;
    }

    /**
     * Getting previous Node
     *
     * @return previous Node
     */
    public Node getPrev() {
        return prev;
    }

    /**
     * Setting previous Node
     *
     * @param prev - Node to set as previous
     */
    public void setPrev(Node prev) {
        this.prev = prev;
    }

    /**
     * Getting next Node
     *
     * @return next Node
     */
    public Node getNext() {
        return next;
    }

    /**
     * Setting next Node
     *
     * @param next - Node to set as next
     */
    public void setNext(Node next) {
        this.next = next;
    }
}

public class IntLinkedList {

    private static final int DEFAULT_INDEX = -1;
    Node last;
    int i;

    /**
     * Add value to the Node
     *
     * @param i - will be added to the Node
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    /**
     * Checking whether LinkedList is empty or not
     *
     * @return true if empty
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * Checking whether LinkedList is full
     *
     * @return false if is full
     */
    public boolean isFull() {
        return false;
    }

    /**
     * Getting top element form the LinkedList
     *
     * @return top element of Linkedlist
     */
    public int top() {
        if (isEmpty())
            return DEFAULT_INDEX;
        return last.value;
    }

    /**
     * Getting and deleting top element from the LinkedList
     *
     * @return top element of LinkedList
     */
    public int pop() {
        if (isEmpty())
            return DEFAULT_INDEX;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

}
