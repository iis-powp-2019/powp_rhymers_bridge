package edu.kis.vh.nursery.list;

/**
 *IntLinkedList is Linked List of integers where inner element of this List are nodes which is inner class
 * 
 */
public class IntLinkedList {
    /**
     * Inner class of node in Linked List
     * elements of Linked List are nodes
     * nodes have value as int, previous node and next node
     */
    private class Node {

        private int value;
        private Node prev;
        private Node next;

        /**
         * Constructor of node with parameter i which is node value
         * @param i value of Node
         */
        protected Node(final int i) {
            setValue(i);
        }

        /**
         * return value of current node
         * @return value of node as int
         */
        public int getValue() {
            return value;
        }

        /**
         * Set new value of current node
         * @param value new value of node as int
         */
        public void setValue(final int value) {
            this.value = value;
        }

        /**
         * return previous node of current node
         * @return previous node of current node as Node
         */
        public Node getPrev() {
            return prev;
        }

        /**
         * Set previous node of current node
         * @param prev new previous node
         */
        public void setPrev(final Node prev) {
            this.prev = prev;
        }

        /**
         * Return next node of current node
         * @return return next node as Node
         */
        public Node getNext() {
            return next;
        }

        /**
         * Set next node of current node
         * @param next new next node of this node
         */
        public void setNext(final Node next) {
            this.next = next;
        }
    }

    private static final int EMPTY = -1;
    private Node last;
    private int i;

    /**
     * add i to the top of Linked List as new element
     * @param i value to add to Linked List as int
     */
    public void push(final int i) {
        if (getLast() == null)
            setLast(new Node(i));
        else {
            getLast().setNext(new Node(i));
            getLast().getNext().setPrev(getLast());
            setLast(getLast().getNext());
        }
    }

    /**
     * Return true if Linked List is empty or false if is not
     * @return true if empty false if not as boolean
     */
    public boolean isEmpty() {
        return getLast() == null;
    }

    /**
     *
     * @return always false
     */
    //TODO: needs to add max capacity of list
    public boolean isFull() {
        return false;
    }

    /**
     *return head element of the Linked List as int
     * @return top element as int
     */
    public int top() {
        if (isEmpty())
            return EMPTY;
        return getLast().getValue();
    }

    /**
     * Return -1 if Linked List is empty.
     * Return and delete head element of the Linked List
     * @return value of the head element of -1 if empty as int
     */
    public int pop() {
        if (isEmpty())
            return EMPTY;
        int ret = getLast().getValue();
        setLast(getLast().getPrev());
        return ret;
    }

    /**
     * Return last element of the linked List
     * @return last element as Node
     */
    public Node getLast() {
        return last;
    }

    /**
     * Set last elemnt of the linked list
     * @param last set last element as last
     */
    public void setLast(final Node last) {
        this.last = last;
    }

    /**
     * Return value of i
     * @return value of i as int
     */
    public int getI() {
        return i;
    }


}
// alt+→ switch to the next open file in IDE
// alt+← switch to the previous open file in IDE