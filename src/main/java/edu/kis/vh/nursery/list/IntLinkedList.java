package edu.kis.vh.nursery.list;


/**
 * The type Int linked list.
 */
class IntLinkedList {
    private Node last;
    private int i;

    private void push(final int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    private boolean isEmpty() {
        return last == null;
    }

    /**
     * Is full boolean.
     *
     * @return the boolean
     */
    public boolean isFull() {
        return false;
    }

    /**
     * Top int.
     *
     * @return the int
     */
    public int top() {
        if (isEmpty())
            return -1;
        return last.value;
    }

    /**
     * Pop int.
     *
     * @return the int
     */
    public int pop() {
        if (isEmpty())
            return -1;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

    /**
     * Gets last.
     *
     * @return the last
     */
    public Node getLast() {
        return last;
    }

    private class Node {

        /**
         * The Value.
         */
        final int value;
        /**
         * The Prev.
         */
        Node prev;
        /**
         * The Next.
         */
        Node next;

        /**
         * Instantiates a new Node.
         *
         * @param i the
         */
        Node(final int i) {
            value = i;
        }

        /**
         * Gets value.
         *
         * @return the value
         */
        public int getValue() {
            return value;
        }

        /**
         * Gets prev.
         *
         * @return the prev
         */
        public Node getPrev() {
            return prev;
        }

        /**
         * Gets next.
         *
         * @return the next
         */
        public Node getNext() {
            return next;
        }

    }


}
