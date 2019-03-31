package edu.kis.vh.nursery.collections;

public class IntLinkedList implements Collections {

    private Node last;
    private int total = COLLECTION_EMPTY_INDEX;

    @Override
    public void countIn(int i) {
        if (last == null) {
            last = new Node(i);
        } else {
            total++;
            last.setNext(new Node(i));
            last.getNext()
                .setPrev(last);
            last = last.getNext();
        }
    }

    @Override
    public boolean callCheck() {
        return last == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int peekaboo() {
        if (callCheck()) {
            return COLLECTION_EMPTY_INDEX;
        }
        return last.getValue();
    }

    @Override
    public int countOut() {
        if (callCheck()) {
            return COLLECTION_EMPTY_INDEX;
        }
        total--;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    @Override
    public int getTotal() {
        return total;
    }

    private class Node {

        private final int value;
        private Node prev, next;

        public Node(final int i) {
            value = i;
        }

        public int getValue() {
            return value;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

    }
}
